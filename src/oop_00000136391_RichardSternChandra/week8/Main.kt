package oop_00000136391_RichardSternChandra.week8

fun main() {
    println("=== TEST SAFE CALL & ELVIS ===")

    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")
}