SUMMARY = "RDKE Bootable Image with App support"

LICENSE = "MIT"
IMAGE_INSTALL = " \
                 packagegroup-vendor-layer \
                 packagegroup-middleware-layer \
                 packagegroup-application-layer \
                 "
IMAGE_INSTALL:append = "volatile-binds"

inherit core-image

inherit custom-rootfs-creation

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE:append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"

create_init_link() {
        ln -sf /sbin/init ${IMAGE_ROOTFS}/init
}

ROOTFS_POSTPROCESS_COMMAND += "create_init_link; "

# Community specific rootfs_postprocess func
ROOTFS_POSTPROCESS_COMMAND += "update_dropbearkey_path; "
update_dropbearkey_path() {
   if [ -f "${IMAGE_ROOTFS}/lib/systemd/system/dropbearkey.service" ]; then
        sed -i 's/\/etc\/dropbear/\/opt\/dropbear/g' ${IMAGE_ROOTFS}/lib/systemd/system/dropbearkey.service
   fi
}

# RDK-50713: Remove securemount dependency from wpa_supplicant.service
# Revert once the actual fix is merged as part of the ticket
ROOTFS_POSTPROCESS_COMMAND += "remove_securemount_dep_patch;"

remove_securemount_dep_patch() {
   sed -i '/Requires=securemount.service/d' ${IMAGE_ROOTFS}/lib/systemd/system/wpa_supplicant.service
   sed -i 's/\bsecuremount\.service\b//g' ${IMAGE_ROOTFS}/lib/systemd/system/wpa_supplicant.service
}


ROOTFS_POSTPROCESS_COMMAND += '${@bb.utils.contains("DISTRO_FEATURES", "debug-variant", "wpeframework_binding_patch; ", "", d)}'

wpeframework_binding_patch(){
    sed -i "s/127.0.0.1/0.0.0.0/g" ${IMAGE_ROOTFS}/etc/WPEFramework/config.json
}


