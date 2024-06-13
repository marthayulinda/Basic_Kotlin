fun main() {
    val urutanAngka = listOf(1,2,3,4,5)

    val eventList = urutanAngka.filter{it % 2 == 0}
    val noteventList = urutanAngka.filterNot{it % 2 == 0}

    println(eventList)
    println(noteventList)

}