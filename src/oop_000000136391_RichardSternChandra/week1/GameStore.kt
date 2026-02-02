package oop_000000136391_RichardSternChandra.week1

fun main(){
    val gameTitle = "Game 1"
    val price = 500000

    val finalPrice = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        userNote = null
    )

}

fun calculateDiscount(price: Int) : Int {
    var newPrice = 0
    if (price > 500000){
        newPrice = price - (price * 20 / 100)
    } else {
        newPrice = price - (price * 10 / 100)
    }
    return newPrice
}

fun printReceipt(title: String, finalPrice: Int, userNote: String?){
    println("====================")
    println("Final Total Bill")
    println("Game Title: $title")
    println("Final Price: $finalPrice")
    println("User Note: ${userNote ?: "Tidak ada catatan"}")
    println("====================")
}