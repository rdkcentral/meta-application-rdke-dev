SUMMARY = "RDK application to showcase rdkservices"
SECTION = "rdk/samples"
LICENSE = "Apache-2.0 & MIT & OFL-1.1 & CC0-1.0 & BitstreamVera"
LIC_FILES_CHKSUM = "file://${S}/../LICENSE;md5=fac1f1de1b2231cdc801d64ac2607c6b"

# Temporary; until following PRs gets to main branch.
# https://github.com/rdkcentral/rdke-refui/pull/5
# https://github.com/rdkcentral/rdke-refui/pull/7

SRC_URI = " \
    git://github.com/rdkcentral/rdke-refui.git;protocol=https;branch=develop \
    npmsw://${THISDIR}/npm-shrinkwrap.json;dev=1;destsuffix=git/accelerator-home-ui \
"
PV = "5.0.18"
PR = "r0"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git/accelerator-home-ui"

inherit npm
PACKAGE_ARCH = "${APP_LAYER_ARCH}"

do_configure() {
    cd "${S}"

    # Select esbuild bundler for Lightning
    echo "LNG_BUNDLER=esbuild" > .env
}

do_compile() {
    export PATH="${WORKDIR}/recipe-sysroot-native/usr/bin:${PATH}"
    cd "${S}"

    # Use the local LNG CLI from node_modules (prefetched by npmsw)
    ./node_modules/@lightningjs/cli/bin/index.js dist

    if [ ! -d dist ]; then
        echo "Error: dist folder not created"
        exit 1
    fi
}

do_install() {
   install -d ${D}/home/root/lxresui
   cp -r ${S}/dist/es6/* ${D}/home/root/lxresui/
}

FILES:${PN} += "/home/root/*"
