package oop_00000136391_RichardSternChandra.week13.tugas1

data class TradeRecord(val id: Int,
                       val symbol: String, val type: String, val margin: Double, val
                       pnl: Double)

fun TradeRecord.toCsv(line: String) : String = "$symbol, $type, $margin, $pnl"