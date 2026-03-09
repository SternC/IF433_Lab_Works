package oop_00000136391_RichardSternChandra.week6

class Smartphone : Camera, Phone {
    override fun turnOn() {
        super<Phone>.turnOn()
        super<Camera>.turnOn()
        println("Sistem operasi Smartphone berhasil booting.")
    }
}