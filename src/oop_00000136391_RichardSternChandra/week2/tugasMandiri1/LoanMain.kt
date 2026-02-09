package oop_00000136391_RichardSternChandra.week2.tugasMandiri1

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    // Validasi lama pinjam tidak boleh minus
    if (duration < 0) {
        duration = 1
    }

    // Buat objek Loan
    val loan = Loan(title, borrower, duration)

    // Print detail peminjaman
    println("\n--- Detail Peminjaman ---")
    println("Judul Buku   : ${loan.bookTitle}")
    println("Peminjam    : ${loan.borrower}")
    println("Lama Pinjam : ${loan.loanDuration} hari")
    println("Total Denda : Rp ${loan.calculateFine()}")
}