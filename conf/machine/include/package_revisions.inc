# Both rdkresidentapp and residentui uses same repo.
PV:pn-rdkresidentapp = "5.0.1"
PR:pn-rdkresidentapp = "r0"
SRCREV:pn-rdkresidentapp = "4172dd990c95146c4c0e7c88497afb5b8fc834a6"
PACKAGE_ARCH:pn-rdkresidentapp = "${APP_LAYER_ARCH}"

PV:pn-residentui = "5.0.1"
PR:pn-residentui = "r0"
SRCREV:pn-residentui = "4172dd990c95146c4c0e7c88497afb5b8fc834a6"
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
