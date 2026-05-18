package oop_00000136391_RichardSternChandra.week13.tugas1

data class TradeRecord(val id: Int,
                       val symbol: String, val type: String, val margin: Double, val
                       pnl: Double)

fun TradeRecord.toCsv(line: String) : String = "$id, $symbol, $type, $margin, $pnl"

fun fromCsvTrade(line: String) : TradeRecord? {
    val parts = line.split(",")
    return TradeRecord(parts[0].toInt(), parts[1], parts[2], parts[3].toDouble(), parts[4].toDouble())
}