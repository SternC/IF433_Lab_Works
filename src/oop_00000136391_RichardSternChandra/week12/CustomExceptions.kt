package oop_00000136391_RichardSternChandra.week12

class InsufficientFundsException(val amount: Double, val balance: Double) : Exception("Attempted $amount, balance: $balance")