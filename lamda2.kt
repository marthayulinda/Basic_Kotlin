fun main() {
    val length = nameLength("Nabila")
    println("Name length $length")
}

val nameLength = {message: String -> message.length}