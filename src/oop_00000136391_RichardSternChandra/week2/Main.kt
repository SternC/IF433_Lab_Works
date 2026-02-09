package oop_00000136391_RichardSternChandra.week2

import java.util.Scanner

fun main (){
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    println("Masukkan Nama: ")
    val name = scanner.nextLine()

    println("Masukkan NIM (Wajib 5 karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5){
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        println("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran selesai.")
    }
}