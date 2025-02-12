LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

FILESEXTRAPATHS:prepend := "${THISDIR}/files/:"
PACKAGE_ARCH = "${APP_LAYER_ARCH}"

SRC_URI += " file://keymapping.json"
S = "${WORKDIR}"

do_install() {
        install -d ${D}/usr/share/content/data/app/cobalt/content/etc
        install -m 0644 ${S}/keymapping.json ${D}/usr/share/content/data/app/cobalt/content/etc/keymapping.json
}

FILES:${PN} += "/usr/share/content/data/app/cobalt/content/etc/keymapping.json"
