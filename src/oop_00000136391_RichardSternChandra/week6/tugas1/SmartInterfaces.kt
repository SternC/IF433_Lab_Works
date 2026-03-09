package oop_00000136391_RichardSternChandra.week6.tugas1

interface SmartDevice {
    val id: String
    val name: String
}

interface Switchable {
    fun turnOn()
    fun turnOff()
}

interface Recordable {
    fun startRecord()
    fun stopRecord() { println("Perekaman dihentikan dan disimpan ke Cloud.") }
}