SUMMARY = "RDK Refernce Script to start the ResidentApp WebkitInstance with RefUI"
SECTION = "rdk/samples"
LICENSE = "Apache-2.0 & MIT & OFL-1.1 & CC0-1.0 & BitstreamVera"
LIC_FILES_CHKSUM = "file://${S}/../../LICENSE;md5=fac1f1de1b2231cdc801d64ac2607c6b"

PACKAGE_ARCH = "${APP_LAYER_ARCH}"

RDEPENDS:${PN} += "bash lighttpd wpeframework"

inherit systemd syslog-ng-config-gen
SYSLOG-NG_FILTER = "residentapp"
SYSLOG-NG_SERVICE_residentapp = "residentapp.service"
SYSLOG-NG_DESTINATION_residentapp = "residentapp.log"
SYSLOG-NG_LOGRATE_residentapp = "low"

SRC_URI = "${CMF_GITHUB_ROOT}/rdke-refui;protocol=${CMF_GIT_PROTOCOL};branch=feature/RDKVREFPLT-4241-refui-refactoring"
SRCREV = "${AUTOREV}"

# Remove once RDKEMW-671 is release. Workaround to fix UI issue
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI += "file://wpeframework-rdkshell.service"

S = "${WORKDIR}/git/residentapp/"

do_install() {
   install -d ${D}${systemd_unitdir}/system
   install -m 0644 ${S}/residentapp.service ${D}${systemd_unitdir}/system/residentapp.service

   install -d ${D}/lib/rdk
   install -m 0755 ${S}/residentApp.sh ${D}/lib/rdk/residentApp.sh

   install -d ${D}${sysconfdir}/lighttpd.d
   install -m 0644 ${S}/ref-webui-docroot-path.conf ${D}${sysconfdir}/lighttpd.d/
}

SYSTEMD_SERVICE:${PN} = "residentapp.service"
FILES:${PN} += "${systemd_unitdir}/system/residentapp.service"
FILES:${PN} += "/lib/rdk/residentApp.sh"

# Remove once RDKEMW-671 is release. Workaround to fix UI issue
SYSTEMD_SERVICE:${PN} += "wpeframework-rdkshell.service"
FILES:${PN} += "${systemd_unitdir}/system/wpeframework-rdkshell.service"
