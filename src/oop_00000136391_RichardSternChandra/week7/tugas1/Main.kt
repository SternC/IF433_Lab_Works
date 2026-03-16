package oop_00000136391_RichardSternChandra.week7.tugas1

fun main() {
    GameManager.startGame()
    GameManager.startGame()

    println("Drop Chance Item Legendary: ${ItemRarity.LEGENDARY.dropChance}%")

    val firstItem = Weapon.forgeStarterSword()
    val (name, damage, rarity) = firstItem.item
    println("Detail Senjata Starter: $name | $damage | $rarity")

    val upgradedItem = firstItem.item.copy(damage = 25)
    println("Detail Senjata Upgraded: ${upgradedItem.name} | ${upgradedItem.damage} | ${upgradedItem.rarity}")

    println("\n=== Simulasi Event ===")
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}