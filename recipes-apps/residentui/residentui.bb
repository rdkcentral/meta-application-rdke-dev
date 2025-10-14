SUMMARY = "RDK application to showcase rdkservices"
SECTION = "rdk/samples"
LICENSE = "Apache-2.0 & MIT & OFL-1.1 & CC0-1.0 & BitstreamVera"
LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=fac1f1de1b2231cdc801d64ac2607c6b"

DEPENDS += "nodejs-native"
DEPENDS += "nodejs"

# Temporary; until following PRs gets to main branch.
# https://github.com/rdkcentral/rdke-refui/pull/5
# https://github.com/rdkcentral/rdke-refui/pull/7

SRC_URI = "git://github.com/rdkcentral/rdke-refui.git;protocol=https;branch=develop"
SRCREV = "8c7f781ff284f5c13fb5013b29c0f9372ac6a742"

S = "${WORKDIR}/git"

inherit npm

PACKAGE_ARCH = "${APP_LAYER_ARCH}"

do_configure[noexec] = "1"
do_patch[noexec] = "1"

do_compile() {
    # Add nodejs-native and npm to PATH
    export PATH="${WORKDIR}/recipe-sysroot-native/usr/bin:${PATH}"

    cd ${S}/accelerator-home-ui

    npm install || { echo "npm install failed"; exit 1; }
    npm install @lightningjs/cli || { echo "Lightning CLI install failed"; exit 1; }
    echo "LNG_BUNDLER=esbuild" > .env
    npm install esbuild || { echo "esbuild install failed"; exit 1; }

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
   cp -r ${S}/accelerator-home-ui/dist/es6/* ${D}/home/root/lxresui/
}

FILES:${PN} += "/home/root/*"
