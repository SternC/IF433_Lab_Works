package oop_00000136391_RichardSternChandra.week6.tugas1

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV $name turned on")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV $name turned off")
        stopRecord()
    }

    override fun startRecord() {
        println("CCTV $name mulai merekam...")
    }
}