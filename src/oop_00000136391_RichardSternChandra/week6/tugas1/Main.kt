package oop_00000136391_RichardSternChandra.week6.tugas1

fun main() {
    val smartLamp1 = SmartLamp("Lamp 1", "Ruang Tamu")
    val smartSpeaker1 = SmartSpeaker("Speaker 1", "Google Nest Dapur")
    val smartCCTV1 = SmartCCTV("CCTV 1", "Ezviz Garasi")

    val smartHomeHub = SmartHomeHub()
    smartHomeHub.addDevice(smartLamp1)
    smartHomeHub.addDevice(smartSpeaker1)
    smartHomeHub.addDevice(smartCCTV1)

    smartHomeHub.activateSecurityMode()
    smartHomeHub.turnOffAllSwitches()
}