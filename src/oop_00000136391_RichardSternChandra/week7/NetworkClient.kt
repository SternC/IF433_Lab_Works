package oop_00000136391_RichardSternChandra.week7

class NetworkClient private constructor(var url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}