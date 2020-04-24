package goodcode.safety.item2

private val primes: Sequence<Int> = sequence {
    var numbers = generateSequence(2) { it + 1 }

    var prime: Int // try to explain
    while (true) {
        prime = numbers.first()
        yield(prime)
        numbers = numbers
            .also { println("${it.take(8).toList()}, prime = $prime") }
            .drop(1)
            .filter { it % prime != 0 }
    }
}

fun main() {
    print(primes.take(10).toList())
}