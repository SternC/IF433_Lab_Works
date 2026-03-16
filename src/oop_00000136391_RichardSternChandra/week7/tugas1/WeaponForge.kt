package oop_00000136391_RichardSternChandra.week7.tugas1

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon {
            val item = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(item, 50)
        }

        fun forgeEpicSword(): Weapon {
            val item = GameItem("Pedang Sawit Epig", 50, ItemRarity.EPIC)
            return Weapon(item, 200)
        }
    }
}