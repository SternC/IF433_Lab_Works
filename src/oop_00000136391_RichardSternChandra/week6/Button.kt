package oop_00000136391_RichardSternChandra.week6

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik")
    }
}