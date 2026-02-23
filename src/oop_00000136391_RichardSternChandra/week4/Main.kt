package oop_00000136391_RichardSternChandra.week4

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val evCar = ElectricCar("BYD", 4, 100)
    evCar.openTrunk()
    evCar.accelerate()
    evCar.honk()
}