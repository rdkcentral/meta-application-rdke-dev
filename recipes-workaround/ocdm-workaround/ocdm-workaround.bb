SUMMARY = "Recipe to install workaround to remove wpeframework-deviceprovisiong dependency on wpeframework-ocdm.service"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

FILESEXTRAPATHS:prepend := "${THISDIR}/files/:"
PACKAGE_ARCH = "${APP_LAYER_ARCH}"

SRC_URI += " file://00-ocdm-workaround.conf"
SRC_URI += " file://wpeframework-ocdm-PREMIUMAPP-3272.service"
S = "${WORKDIR}"

#ocdm-workaround, no need for configuration/compilation
do_compile[noexec] = "1"
do_configure[noexec] = "1"
do_patch[noexec] = "1"

do_install() {
        install -D -m 0644 ${WORKDIR}/00-ocdm-workaround.conf ${D}${systemd_unitdir}/system/residentapp.service.d/00-ocdm-workaround.conf
        install -D -m 0644 ${WORKDIR}/wpeframework-ocdm-PREMIUMAPP-3272.service ${D}${systemd_unitdir}/system/wpeframework-ocdm-PREMIUMAPP-3272.service
}

FILES:${PN} += "${systemd_unitdir}/system/residentapp.service.d/*"
FILES:${PN} += "${systemd_unitdir}/system/wpeframework-ocdm-PREMIUMAPP-3272.service"
