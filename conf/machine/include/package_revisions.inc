# Both rdkresidentapp and residentui uses same repo.
PV:pn-rdkresidentapp = "5.0.24"
PR:pn-rdkresidentapp = "r0"
SRCREV:pn-rdkresidentapp = "9f0002d3633bfa8ee5cd7391fb3129c91b8c9f3d"
PACKAGE_ARCH:pn-rdkresidentapp = "${APP_LAYER_ARCH}"

PV:pn-residentui = "5.0.24"
PR:pn-residentui = "r0"
SRCREV:pn-residentui = "9f0002d3633bfa8ee5cd7391fb3129c91b8c9f3d"
PACKAGE_ARCH:pn-residentui = "${APP_LAYER_ARCH}"

PV:pn-dab-adapter = "0.8.0-dev"
PR:pn-dab-adapter = "r0"
SRCREV:pn-dab-adapter = "5ebab46c4a7f88ddc8bd173f8fea50089338a7f7"
PACKAGE_ARCH:pn-dab-adapter = "${APP_LAYER_ARCH}"

# mosquitto version is determined by the meta-openembedded layer version
PACKAGE_ARCH:pn-mosquitto = "${APP_LAYER_ARCH}"

PV:pn-dlt-daemon = "2.18.8"
PR:pn-dlt-daemon = "r0"
SRCREV:pn-dlt-daemon = "6a3bd901d825c7206797e36ea98e10a218f5aad2"
PACKAGE_ARCH:pn-dlt-daemon = "${APP_LAYER_ARCH}"
