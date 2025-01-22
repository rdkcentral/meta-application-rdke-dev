# Both rdkresidentapp and residentui uses same repo.
PV:pn-rdkresidentapp = "1.0.0"
PR:pn-rdkresidentapp = "r0"
SRCREV:pn-rdkresidentapp = "3bfd5735a006b341d1a50825719fc04aec40eb0e"
PACKAGE_ARCH:pn-rdkresidentapp = "${APP_LAYER_ARCH}"

PV:pn-residentui = "4.5.7"
PR:pn-residentui = "r0"
SRCREV:pn-residentui = "3bfd5735a006b341d1a50825719fc04aec40eb0e"
PACKAGE_ARCH:pn-residentui = "${APP_LAYER_ARCH}"

PACKAGE_ARCH:pn-dab-adapter = "${APP_LAYER_ARCH}"
+PACKAGE_ARCH:pn-mosquitto = "${APP_LAYER_ARCH}"
