package oop_00000136391_RichardSternChandra.week9.tugas1

data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status: String
)