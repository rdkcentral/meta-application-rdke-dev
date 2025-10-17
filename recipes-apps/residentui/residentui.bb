SUMMARY = "RDK application to showcase rdkservices"
SECTION = "rdk/samples"
LICENSE = "Apache-2.0 & MIT & OFL-1.1 & CC0-1.0 & BitstreamVera"
LIC_FILES_CHKSUM = "file://${S}/../LICENSE;md5=fac1f1de1b2231cdc801d64ac2607c6b"

# Temporary; until following PRs gets to main branch.
# https://github.com/rdkcentral/rdke-refui/pull/5
# https://github.com/rdkcentral/rdke-refui/pull/7

SRC_URI = "npm://github.com/rdkcentral/rdke-refui.git;protocol=https;branch=feature/devUI"

S = "${WORKDIR}/git/accelerator-home-ui"

inherit npm

DEPENDS += "nodejs-native"

PACKAGE_ARCH = "${APP_LAYER_ARCH}"

do_compile() {
    export PATH="${WORKDIR}/recipe-sysroot-native/usr/bin:${PATH}"

    # Build the Lightning app
    ./node_modules/.bin/lng dist || { echo "lng dist failed"; exit 1; }

    # Confirm dist folder exists
    if [ ! -d dist ]; then
        echo "Error: dist folder not created"
        exit 1
    fi
}

do_install() {
   install -d ${D}/home/root/lxresui
   cp -r dist/es6/* ${D}/home/root/lxresui/
}

FILES:${PN} += "/home/root/*"
