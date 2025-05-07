# Both rdkresidentapp and residentui uses same repo.
PV:pn-rdkresidentapp = "4.7.1"
PR:pn-rdkresidentapp = "r0"
SRCREV:pn-rdkresidentapp = "dd2ec6320ddc95d7d0ea770b0c9a6d799ee41685"
PACKAGE_ARCH:pn-rdkresidentapp = "${APP_LAYER_ARCH}"

PV:pn-residentui = "4.7.1"
PR:pn-residentui = "r0"
SRCREV:pn-residentui = "dd2ec6320ddc95d7d0ea770b0c9a6d799ee41685"
PACKAGE_ARCH:pn-residentui = "${APP_LAYER_ARCH}"

PV:pn-dab-adapter = "0.7.0"
PR:pn-dab-adapter = "r0"
SRCREV:pn-dab-adapter = "cd438ca9e913f584fdf8e54718e075a77d78937f"
PACKAGE_ARCH:pn-dab-adapter = "${APP_LAYER_ARCH}"

# mosquitto version is determined by the meta-openembedded layer version
PACKAGE_ARCH:pn-mosquitto = "${APP_LAYER_ARCH}"

PV:pn-dlt-daemon = "2.18.8"
PR:pn-dlt-daemon = "r0"
SRCREV:pn-dlt-daemon = "6a3bd901d825c7206797e36ea98e10a218f5aad2"
PACKAGE_ARCH:pn-dlt-daemon = "${APP_LAYER_ARCH}"
