fun main() {
    val setAngka1 = setOf(1,2,3,4,4,5,5)
    val setAngka2 = setOf(1,1,2,2,3,5)
    val setAngka3 = setOf(6,7)

    val gabungan = setAngka1.union(setAngka2).union(setAngka3)
    val irisan = setAngka1.intersect(setAngka2)

    println(gabungan)
    println(irisan)

}