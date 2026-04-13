package oop_00000136391_RichardSternChandra.week8.tugas1

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not an Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    val apiParser = ApiParser()

    for (raw in rawApiData) {
        try { apiParser.parseProduct(raw)?.let {
            product -> apiParser.checkout(product)
        } } catch (e: IllegalArgumentException) { println("Data Corrupted: ${e.message}") }
    }

    // OUTPUT
    // Transaction Success! ID: TRX-E01-SUCCESS
    //Transaction Success! ID: TRX-C01-SUCCESS
    //Transaction Success! ID: TRX-E02-SUCCESS
    //Data Corrupted: API Invalid! Missing ID
}