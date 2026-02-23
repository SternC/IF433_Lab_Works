package oop_00000136391_RichardSternChandra.week4.tugas2

fun main() {
    println("--- Manager ---")
    val myManager = Manager("Adit", 5000000)
    myManager.work()
    println(myManager.calculateBonus())

    println("\n--- Developer ---")
    val myDeveloper = Developer("Tida", 8000000, "Python")
    myDeveloper.work()
    println(myDeveloper.calculateBonus())
}