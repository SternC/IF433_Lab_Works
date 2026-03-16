package oop_00000136391_RichardSternChandra.week7.tugas1

fun processEvent(event: BattleState) {

    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Anda menemukan sebuah monster bernama ${event.monsterName}")
        }

        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            println("Monster telah ditaklukkan!")
            println("Anda mendapatkan item $name dengan rarity $rarity")
        }

        is BattleState.GameOver -> {
            println("Anda kalah. Alasan: ${event.reason}")
        }

        is BattleState.SafeZone -> {
            println("Anda telah memasuki sebuah zona aman.")
        }
    }
}