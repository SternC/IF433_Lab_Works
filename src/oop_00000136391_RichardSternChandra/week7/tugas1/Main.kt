package oop_00000136391_RichardSternChandra.week7.tugas1

fun main() {
    GameManager.startGame()
    GameManager.startGame()

    println("Drop Chance Item Legendary: ${ItemRarity.LEGENDARY.dropChance}%")

    val firstItem = Weapon.forgeStarterSword()
    val (name, damage, rarity) = firstItem.item
    println("Detail Senjata starter: $name | $damage | $rarity")
}