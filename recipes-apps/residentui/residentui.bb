SUMMARY = "RDK application to showcase rdkservices"
SECTION = "rdk/samples"
LICENSE = "Apache-2.0 & MIT & OFL-1.1 & CC0-1.0 & BitstreamVera"
LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=387be95ea3370b9ae768c395d4eeaeea"

# Temporary; until following PRs gets to main branch.
# https://github.com/rdkcentral/rdke-refui/pull/5
# https://github.com/rdkcentral/rdke-refui/pull/7

SRC_URI = "https://github.com/rdkcentral/rdke-refui/releases/download/${PV}/refui-${PV}.tar.gz;subdir=refui-${PV}"
SRC_URI[sha256sum] = "ed901f31022e75c67c8669efa1abc0ff63b90d1d033c968db916e56a7f82e9db"

S = "${WORKDIR}/refui-${PV}"

PACKAGE_ARCH = "${APP_LAYER_ARCH}"

#Lightning application, no need for configuration/compilation
do_compile[noexec] = "1"
do_configure[noexec] = "1"
do_patch[noexec] = "1"

RDEPENDS:${PN}-dev = ""

do_install() {
   install -d ${D}/home/root/lxresui
   cp -r ${S}/* ${D}/home/root/lxresui/
}

FILES:${PN} += "/home/root/*"
