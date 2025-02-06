# WPE Framework common
LICENSE = "Apache-2.0"
HOMEPAGE = "https://github.com/rdkcentral/Thunder"

//THUNDER_RELEASE_TAG_NAME = "${@bb.utils.contains('DISTRO_FEATURES', 'wpe_r4', 'R4.4.1', 'R2.1.16', d)}"
def get_thunder_release(d):
    if bb.utils.contains("DISTRO_FEATURES", "wpe_r4_4", "true", "false", d) == "true":
        return "R4.4.1"
    elif bb.utils.contains("DISTRO_FEATURES", "wpe_r4", "true", "false", d) == "true":
        return "R4.2"
    else:
        return "R2.1.16"
    fi

THUNDER_RELEASE_TAG_NAME = "${@get_thunder_release(d)}"

PACKAGECONFIG ??= ""
PACKAGECONFIG[debug]            = "-DCMAKE_BUILD_TYPE=Debug,-DCMAKE_BUILD_TYPE=Release,"

S = "${WORKDIR}/git"

inherit cmake pkgconfig

TOOLCHAIN = "gcc"
EXTRA_OECMAKE += "-DCMAKE_SYSROOT=${STAGING_DIR_HOST}"
#EXTRA_OECMAKE += "-DTOOLS_SYSROOT=${STAGING_DIR_NATIVE}"
