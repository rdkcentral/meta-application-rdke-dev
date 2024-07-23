SUMMARY = "A image just capable of allowing a device to boot."

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

LICENSE = "MIT"
IMAGE_INSTALL = " \
                 packagegroup-foundation-layer \
                 packagegroup-vendor-layer \
                 packagegroup-middleware-generic \
                 packagegroup-application-layer \
                 "
inherit core-image

inherit custom-rootfs-creation

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"

create_init_link() {
        ln -sf /sbin/init ${IMAGE_ROOTFS}/init
}

ROOTFS_POSTPROCESS_COMMAND += "create_init_link; "
