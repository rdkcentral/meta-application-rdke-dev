LICENSE = "MIT OR Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit pkgconfig systemd syslog-ng-config-gen

SYSLOG-NG_FILTER = "dab"
SYSLOG-NG_SERVICE_dab = "dab-adapter.path dab-adapter.service"
SYSLOG-NG_DESTINATION_dab = "dab-adapter.log"
SYSLOG-NG_LOGRATE_dab = "low"

export OPENSSL_NO_VENDOR = "true"

DEPENDS += " openssl"
DEPENDS += " alsa-lib"
DEPENDS += " libssh2"
RDEPENDS_${PN} = " mosquitto openssl"

SRC_URI:append = " file://dab-adapter.service "
SRC_URI:append = " file://dab-adapter.path "
SRC_URI:append = " file://keymap.json "
SRC_URI:append = " file://settings.json "

FILES:${PN} += "${systemd_unitdir}/system/dab-adapter.service"
FILES:${PN} += "${systemd_unitdir}/system/dab-adapter.path"

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE:${PN} = "dab-adapter.path"

do_compile[network] = "1"

do_install:append() {
  install -d ${D}/${systemd_unitdir}/system
  install -m 0644 ${WORKDIR}/dab-adapter.service ${D}/${systemd_unitdir}/system
  install -m 0644 ${WORKDIR}/dab-adapter.path ${D}/${systemd_unitdir}/system
  install -d ${D}/${sysconfdir}/dab
  install -m 0644 ${WORKDIR}/keymap.json ${D}/${sysconfdir}/dab
  install -m 0644 ${WORKDIR}/settings.json ${D}/${sysconfdir}/dab
}
