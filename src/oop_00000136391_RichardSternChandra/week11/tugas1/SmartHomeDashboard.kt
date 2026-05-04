package oop_00000136391_RichardSternChandra.week11.tugas1

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice("", "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    SmartDevice("Ezviz Outdoor", "Camera").apply{
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }
}