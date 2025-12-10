# To support layered ipk generation
LAYER_EXTENSION = "-application"
APP_LAYER_ARCH ??= "${MACHINE}-application"

PACKAGE_EXTRA_ARCHS:append = " ${APP_LAYER_ARCH}"
require package_revisions.inc
