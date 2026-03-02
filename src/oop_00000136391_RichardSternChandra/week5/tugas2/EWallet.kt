package oop_00000136391_RichardSternChandra.week5.tugas2

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (amount > balance) {
            println("Saldo tidak mencukupi.")
        } else {
            balance -= amount
            println("Sukses.")
        }
    }

    fun topUp(amount: Double){
        balance += amount
    }

}