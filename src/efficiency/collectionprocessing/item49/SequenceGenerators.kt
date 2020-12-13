package efficiency.collectionprocessing.item49

val fibonacci = sequence {
    yield(1)
    var current = 1
    var prev = 1
    while (true) {
        yield(current)
        val temp = prev
        prev = current
        current += temp
    }
}

fun main() {
    println("Generated sequence:")
    generateSequence(1) { it + 1 }
        .map { it * 2 }
        .take(10)
        .forEach { print("$it, ") }

    println("\nFibonacci:")
    println(fibonacci.take(5).toList())
//    println(fibonacci.toList()) // infinite loop!
}