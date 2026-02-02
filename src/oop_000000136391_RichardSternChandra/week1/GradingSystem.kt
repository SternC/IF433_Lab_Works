package oop_000000136391_RichardSternChandra.week1

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak lulus"

fun main(){
    val name: String = "John Thor"
    val score: Int = 80

    println("Nama: $name, Nilai: $score")

    val grade = when (score){
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")

    println("Status: ${calculateStatus(score)}")


    val studentId: String? = null
    val idLength = studentId?.length ?: 0

    println("Panjang ID: $idLength")
}