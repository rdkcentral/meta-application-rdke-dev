SUMMARY = "Custom package group for application layer"
PACKAGE_ARCH = "${APP_LAYER_ARCH}"

LICENSE = "MIT"

inherit packagegroup

##Change the version number for each release.
PV = "4.0.0"

RDEPENDS:packagegroup-application-layer = " \
                                           residentui \
                                           rdkresidentapp \
                                           ${@bb.utils.contains('DISTRO_FEATURES', 'enable-dab', 'dab-adapter mosquitto ', '', d)} \
                                         "
