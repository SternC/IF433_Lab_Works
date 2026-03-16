package oop_00000136391_RichardSternChandra.week7.tugas1

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame() {
        if (!isGameRunning) {
            isGameRunning = true
            println("Memulai Game Engine...")
        } else {
            println("Game sudah berjalan! Mencegah instansiasi ganda.")
        }
    }
}