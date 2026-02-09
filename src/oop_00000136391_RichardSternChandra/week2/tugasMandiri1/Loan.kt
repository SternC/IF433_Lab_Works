package oop_00000136391_RichardSternChandra.week2.tugasMandiri1

class Loan (val bookTitle: String, val borrower: String, var loanDuration: Int = 1) {
    fun calculateFine(): Int {
        var fine: Int = 0
        if (loanDuration > 3){
            fine = (loanDuration - 3) * 2000
        } else {
            fine = 0
        }
        return fine
    }
}