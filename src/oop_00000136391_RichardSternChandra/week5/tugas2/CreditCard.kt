package oop_00000136391_RichardSternChandra.week5.tugas2

class CreditCard(accountName: String, val limit: Double, var usedAmount: Double = 0.0) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (usedAmount + amount < limit){
            usedAmount += amount
            println("Sukses")
        } else {
            println("Transaksi ditolak. Anda melebihi limit")
        }
    }
}