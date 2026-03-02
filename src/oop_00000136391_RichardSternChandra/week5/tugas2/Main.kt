package oop_00000136391_RichardSternChandra.week5.tugas2

fun main() {
    val eWallet = EWallet("Stern", 5000.0)
    val creditCard = CreditCard("Stern", 100000.0)

    val accountPaymentMethod : List<PaymentMethod> = listOf(eWallet, creditCard)

    for (payment in accountPaymentMethod){
        payment.processPayment(75000.0)
    }
}