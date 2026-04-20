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
    val losingTrades = closedTrades.filter { it.roe <= 0 } // Lupa masukin ke commit

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map {
            "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")

    println("\nTop Perfomers")
    topPerformersString.forEach {
        println(it)
    }

    println("\nWorst Perfomers")
    worstPerformersString.forEach {
        println(it)
    }

    println("\nUnique Pairs")
    println(uniquePairs)

}

/* === CRYPTO TRADING DASHBOARD ===


Top Perfomers

WIN [BTCUSDT - LONG]: +15.5% ROE (Lev: 20x)

Worst Perfomers

LOSS [BTCUSDT - SHORT]: -2.1% ROE (Lev: 15x)
LOSS [ETHUSDT - LONG]: -1.5% ROE (Lev: 10x)

Unique Pairs
[BTCUSDT, ETHUSDT]

*/