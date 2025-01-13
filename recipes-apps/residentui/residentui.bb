SUMMARY = "RDK application to showcase rdkservices"
SECTION = "rdk/samples"
LICENSE = "Apache-2.0 & MIT & OFL-1.1 & CC0-1.0 & BitstreamVera"
LIC_FILES_CHKSUM = "file://${S}/../../LICENSE;md5=fac1f1de1b2231cdc801d64ac2607c6b"

# Temporary; until following PRs gets to main branch.
# https://github.com/rdkcentral/rdke-refui/pull/5
# https://github.com/rdkcentral/rdke-refui/pull/7
SRC_URI = "${CMF_GITHUB_ROOT}/rdke-refui/releases/download/${PV}/refui-${PV}.tar.gz"

PACKAGE_ARCH = "${APP_LAYER_ARCH}"

#Lightning application, no need for configuration/compilation
do_compile[noexec] = "1"
do_configure[noexec] = "1"

RDEPENDS:${PN}-dev = ""

do_install() {
   install -d ${D}/home/root/lxresui
   cp -r ${WORKDIR}/refui-${PV}/* ${D}/home/root/lxresui/
}

FILES:${PN} += "/home/root/*"
