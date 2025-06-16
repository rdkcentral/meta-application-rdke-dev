# Both rdkresidentapp and residentui uses same repo.
PV:pn-rdkresidentapp = "4.7.9"
PR:pn-rdkresidentapp = "r0"
SRCREV:pn-rdkresidentapp = "71e4c4b0ca4c9476b44d7b4b9ebea1567cd93090"
PACKAGE_ARCH:pn-rdkresidentapp = "${APP_LAYER_ARCH}"

PV:pn-residentui = "4.7.9"
PR:pn-residentui = "r0"
SRCREV:pn-residentui = "71e4c4b0ca4c9476b44d7b4b9ebea1567cd93090"
PACKAGE_ARCH:pn-residentui = "${APP_LAYER_ARCH}"

PV:pn-dab-adapter = "0.7.0"
PR:pn-dab-adapter = "r0"
SRCREV:pn-dab-adapter = "1b439ab62ba65fdc06bd9d3bb34a5b7208e03d30"
PACKAGE_ARCH:pn-dab-adapter = "${APP_LAYER_ARCH}"

# mosquitto version is determined by the meta-openembedded layer version
PACKAGE_ARCH:pn-mosquitto = "${APP_LAYER_ARCH}"

PV:pn-dlt-daemon = "2.18.8"
PR:pn-dlt-daemon = "r0"
SRCREV:pn-dlt-daemon = "6a3bd901d825c7206797e36ea98e10a218f5aad2"
PACKAGE_ARCH:pn-dlt-daemon = "${APP_LAYER_ARCH}"
