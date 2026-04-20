package oop_00000136391_RichardSternChandra.week9.tugas1

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 5.2, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 15, -2.1, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 5, 3.8, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 10, -1.5, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 25, -4.3, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }