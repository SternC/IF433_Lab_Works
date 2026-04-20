package oop_00000136391_RichardSternChandra.week9.tugas1

data class TradeLog(
    val symbol: String,
    val status: String,
    val roe: Double
)

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "OPEN", 5.2),
        TradeLog("BTCUSDT", "CLOSED", -2.1),
        TradeLog("ETHUSDT", "OPEN", 3.8),
        TradeLog("ETHUSDT", "CLOSED", -1.5),
        TradeLog("BTCUSDT", "CLOSED", 7.0),
        TradeLog("ETHUSDT", "OPEN", -4.3)
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }