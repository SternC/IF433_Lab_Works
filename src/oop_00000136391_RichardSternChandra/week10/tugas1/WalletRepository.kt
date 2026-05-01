package oop_00000136391_RichardSternChandra.week10.tugas1

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun addItem(item: T){
        items.add(item)
    }

    fun getAll() : List<T>{
        return items
    }
}