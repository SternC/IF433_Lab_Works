package oop_00000136391_RichardSternChandra.week4.tugas2

class Developer(name: String, baseSalary: Int, val programmingLanguage: String): Employee(name, baseSalary) {
    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage")
    }
}