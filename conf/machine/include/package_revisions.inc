# Both rdkresidentapp and residentui uses same repo.
PV:pn-rdkresidentapp = "4.7.15"
PR:pn-rdkresidentapp = "r0"
SRCREV:pn-rdkresidentapp = "2428a7b6fd1695c67a4844ab3a7985c40de33c33"
PACKAGE_ARCH:pn-rdkresidentapp = "${APP_LAYER_ARCH}"

PV:pn-residentui = "4.7.15"
PR:pn-residentui = "r0"
SRCREV:pn-residentui = "2428a7b6fd1695c67a4844ab3a7985c40de33c33"
PACKAGE_ARCH:pn-residentui = "${APP_LAYER_ARCH}"

PV:pn-dab-adapter = "0.7.0"
PR:pn-dab-adapter = "r0"
SRCREV:pn-dab-adapter = "3f093a72f61760d9b2e442b9ef6d7190c6dba7d6"
PACKAGE_ARCH:pn-dab-adapter = "${APP_LAYER_ARCH}"

# mosquitto version is determined by the meta-openembedded layer version
PACKAGE_ARCH:pn-mosquitto = "${APP_LAYER_ARCH}"

PV:pn-dlt-daemon = "2.18.8"
PR:pn-dlt-daemon = "r0"
SRCREV:pn-dlt-daemon = "6a3bd901d825c7206797e36ea98e10a218f5aad2"
PACKAGE_ARCH:pn-dlt-daemon = "${APP_LAYER_ARCH}"
