package oop_00000136391_RichardSternChandra.week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan base damage Hero: ")
    val heroDamage = scanner.nextInt()

    val hero = Hero(heroName, baseDamage = heroDamage)

    var enemyHp = 100

    println("\n=== Pertarungan Dimulai ===")

    while (hero.isAlive() && enemyHp > 0) {
        println("\nMenu:")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack("Musuh")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("HP Musuh tersisa: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Musuh membalas dan memberikan damage $enemyDamage!")
                hero.takeDamage(enemyDamage)
                println("HP ${hero.name} tersisa: ${hero.hp}")
            }

        } else if (choice == 2) {
            println("${hero.name} kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

    println("\n--- Pertarungan Selesai ---")
    if (hero.isAlive() && enemyHp <= 0) {
        println("${hero.name} MENANG!")
    } else if (!hero.isAlive()) {
        println("Musuh MENANG!")
    } else {
        println("Pertarungan berakhir tanpa pemenang.")
    }
}
