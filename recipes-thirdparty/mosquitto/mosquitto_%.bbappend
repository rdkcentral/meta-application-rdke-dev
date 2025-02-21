do_install:append () {
   if [ -f "${D}${sysconfdir}/mosquitto/mosquitto.conf" ]; then
       rm -f ${D}${sysconfdir}/mosquitto/mosquitto.conf
   fi
}

FILES:${PN}-dev:remove = "${sysconfdir}/mosquitto/mosquitto.conf"
