package oop_00000136391_RichardSternChandra.week3.tugas1

class Weapon(val name: String){
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Damage can't be negative!")
                field = 0
            } else if (value > 1000) {
                println("ERROR: Damage can't be greater than 1000 -- Setting your damage to 1000")
                field = 1000
            } else {
                field = value
            }
        }
    val tier: String
        get() = if (damage > 800) {
            "Legendary"
        } else if (damage > 500) {
            "Epic"
        } else {
            "Common"
        }
}