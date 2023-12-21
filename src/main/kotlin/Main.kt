infix fun Int.multiply(x: Int): Int {
    return this * x
}

fun main() {
    val multiply1 = 3.multiply(10)
    val multiply2 = 3 multiply 10

    println("multi1: $multiply1")
    println("multi2: $multiply2")
}