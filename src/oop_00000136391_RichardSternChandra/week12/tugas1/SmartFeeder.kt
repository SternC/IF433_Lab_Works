package oop_00000136391_RichardSternChandra.week12.tugas1

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean) : Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0" }
    if (isJammed) {
        throw DispenserJamException()
    }
    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }
    // Added return
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    try { dispenseKibble(80, currentKibbleStock, false) }
    catch (e: DispenserJamException) { println("Caught Device Error: Device is Jammed! ${e.message}") }
    catch (e: FoodEmptyException) { println("Caught Device Error: Device is FoodEmpty! ${e.message}") }
    catch (e: Exception) { println("Caught General Error: Unknown error!") }
}