package oop_00000136391_RichardSternChandra.week5.tugas2

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)
}