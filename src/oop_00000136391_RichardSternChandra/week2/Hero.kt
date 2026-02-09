package oop_00000136391_RichardSternChandra.week2

class Hero (val name: String, var hp: Int, val baseDamage: Int){
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        if (hp - damage < 0) {
            hp = 0
        } else {
            hp = hp - damage
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}