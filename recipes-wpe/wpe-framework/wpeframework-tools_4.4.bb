SUMMARY = "Host/Native tooling for the Web Platform for Embedded Framework"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c3349dc67b2f8c28fc99b300eb39e3cc"

require include/thunder.inc

PV = "4.4+git${SRCPV}"

SRC_URI = "git://github.com/rdkcentral/ThunderTools.git;protocol=git;branch=R4_4"

SRC_URI += "file://0003-R4.4-Change-MODULE-PATH.patch"
SRC_URI += "file://00010-R4.4-Add-support-for-project-dir.patch"
SRCREV = "R4.4.3"

inherit cmake pkgconfig python3native

DEPENDS = "\
    python3-native \
    python3-jsonref-native \
"

FILES:${PN} += "${datadir}/*/Modules/*.cmake"

OECMAKE_SOURCEPATH = "${WORKDIR}/git"
BBCLASSEXTEND = "native nativesdk"
