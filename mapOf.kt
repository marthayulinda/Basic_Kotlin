fun main() {
    val gatot = mapOf(
        1 to "Syalom",
        2 to "Horas",
        3 to "Salam",
        4 to "Yoo",
        5 to "Hadeh",

    )
    println(gatot) // mencetak spt biasa
    println(gatot[3]) //mencetak value yg ada di key -3
    println(gatot.getValue(4))
    println(gatot.keys)
}