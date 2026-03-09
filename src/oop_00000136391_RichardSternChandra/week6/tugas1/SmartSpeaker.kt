package oop_00000136391_RichardSternChandra.week6.tugas1

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Speaker $name has been turned on")
    }

    override fun turnOff() {
        println("Speaker $name has been turned off")
    }

    fun playMusic(song: String){
        println("Memainkan lagu $song dari Spotify ")
    }
}