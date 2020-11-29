package efficiency.makeitcheap.item45

import kotlin.system.measureTimeMillis

fun <T: Comparable<T>> Iterable<T>.countMax(): Int {
//    val max = this.maxOrNull()
    return count { it == this.maxOrNull() }
}

fun main() {
    val bigList = (0..1000).toList()
    val maxTime = measureTimeMillis { bigList.countMax() }

    println("CountMax time: $maxTime (ms)")
}