package efficiency.makeitcheap.item45

import kotlin.system.measureTimeMillis

fun Iterable<Int>.maxOrNullCustom(): Int? {
    var max: Int? = null // 2. We use a nullable value, so under the hood in JVM, there will be an Integer instead of an int
    for (i in this) {
        max = if (i > (max ?: Int.MIN_VALUE)) i else max // 1. We need to use an Elvis operator in every step
    }
    return max
}

fun main() {
    val bigList: List<Int> = (0..100000).toList()
    val customTime = measureTimeMillis { bigList.maxOrNullCustom() }
    val stdTime = measureTimeMillis { bigList.maxOrNull() }

    println("MaxOrNullCustom time: $customTime (ms)")
    println("MaxOrNull time: $stdTime (ms)")
}