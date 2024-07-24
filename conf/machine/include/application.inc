# To support layered ipk generation
APP_LAYER_ARCH = "${MACHINE}-apps"

PACKAGE_EXTRA_ARCHS_append = " ${APP_LAYER_ARCH}"
require package_revisions.inc
