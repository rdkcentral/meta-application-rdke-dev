SUMMARY = "RDK application to showcase rdkservices"
SECTION = "rdk/samples"
LICENSE = "Apache-2.0 & MIT & OFL-1.1 & CC0-1.0 & BitstreamVera"
LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=fac1f1de1b2231cdc801d64ac2607c6b"

# Temporary; until following PRs gets to main branch.
# https://github.com/rdkcentral/rdke-refui/pull/5
# https://github.com/rdkcentral/rdke-refui/pull/7

SRC_URI = "https://github.com/rdkcentral/rdke-refui/releases/download/${PV}/refui-${PV}.tar.gz;subdir=refui-${PV}"
SRC_URI[sha256sum] = "5e75f12cb8d354d4a1e1bde292edd0c3a6cce1ec4d894304d6fc4e1470b490d6"

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
