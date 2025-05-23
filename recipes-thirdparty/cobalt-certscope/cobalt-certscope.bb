SUMMARY = "Recipe to update cobalt certscope"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

FILESEXTRAPATHS:prepend := "${THISDIR}/files/:"
PACKAGE_ARCH = "${APP_LAYER_ARCH}"

SRC_URI = " file://00-cobalt-certscope.conf"

# cobalt-certscope, no need for configuration/compilation
do_compile[noexec] = "1"
do_configure[noexec] = "1"
do_patch[noexec] = "1"

COBALT_CERTSCOPE ?= "${PRODUCT_CONF_COBALT_CERTSCOPE}"

do_install() {
    if [ -n "${COBALT_CERTSCOPE}" ]; then
        install -D -m 0644 ${WORKDIR}/00-cobalt-certscope.conf ${D}${systemd_unitdir}/system/wpeframework.service.d/00-cobalt-certscope.conf

        install -d ${D}${datadir}/content/data/app/cobalt/content/etc
        echo -n "${COBALT_CERTSCOPE}" > ${D}${datadir}/content/data/app/cobalt/content/etc/cobalt_certscope
    fi
}

ALLOW_EMPTY:${PN} = "1"
FILES:${PN} += "${datadir}"
FILES:${PN} += "${systemd_unitdir}"
