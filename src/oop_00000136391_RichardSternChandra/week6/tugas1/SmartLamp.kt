package oop_00000136391_RichardSternChandra.week6.tugas1

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Lamp $name has been turned on")
    }

    override fun turnOff() {
        println("Lamp $name has been turned off")
    }
}