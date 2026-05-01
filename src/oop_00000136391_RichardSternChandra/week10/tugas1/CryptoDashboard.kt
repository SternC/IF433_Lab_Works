package oop_00000136391_RichardSternChandra.week10.tugas1

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.addItem(Coin("BTC", 5.0))
    coinRepo.addItem(Coin("ETH", 2.5))
    coinRepo.addItem(Coin("USDT", 3.2))

    val response = ApiResponse("200 OK", coinRepo.getAll())
    println(response)

    response.data.forEach { coin -> println("Coin - ${coin.name} | Balance - ${coin.balance}") }

    val txRepo = WalletRepository<Transaction>()
    txRepo.addItem(Transaction("TSC-01", 4.1))
    txRepo.addItem(Transaction("TSC-02", 6.7))
    txRepo.addItem(Transaction("TSC-03", 1.2))
}