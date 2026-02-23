package oop_00000136391_RichardSternChandra.week4.tugas2

open class Employee(val name: String, val baseSalary: Int) {
    open fun work() {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int{
        return baseSalary / 10
    }
}