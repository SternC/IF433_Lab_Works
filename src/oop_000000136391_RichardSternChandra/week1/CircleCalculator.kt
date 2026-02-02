package oop_000000136391_RichardSternChandra.week1

fun main(args: Array<String>){
    val radius = 7.0
    val pi = 3.14

    var area: Double = pi * radius * radius

    println("Radius: $radius, Area: $area")

    println("${checkSize(area)}")
}


fun checkSize(area: Double) : String {
    var output = ""
    if (area > 100){
        output = "This is a Big Circle"
    } else {
        output = "This is a Small Circle"
    }

    return output
}