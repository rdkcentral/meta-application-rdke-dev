do_install:append () {
    sed -i 's/# allow_anonymous$/allow_anonymous true/' ${D}${sysconfdir}/mosquitto/mosquitto.conf
    sed -i 's/#user mosquitto/user root/' ${D}${sysconfdir}/mosquitto/mosquitto.conf
    sed -i 's/#listener/listener 1883/' ${D}${sysconfdir}/mosquitto/mosquitto.conf
}
