package efficiency.makeitcheap.item45

import java.lang.ref.SoftReference
import java.math.BigInteger
import kotlin.reflect.KProperty
import kotlin.system.measureNanoTime

private val FIB_CACHE: MutableMap<Int, BigInteger> by SoftReferenceDelegate { mutableMapOf() }

fun fib(n: Int): BigInteger = FIB_CACHE.getOrPut(n) {
    if (n <= 1) BigInteger.ONE else fib(n - 1) + fib(n - 2)
}

class SoftReferenceDelegate<T : Any>(
    val initialization: () -> T
) {
    private var reference: SoftReference<T>? = null

    operator fun getValue(
        thisRef: Any?,
        property: KProperty<*>
    ): T {
        val stored = reference?.get()
        if (stored != null) return stored
        val new = initialization()
        reference = SoftReference(new)
        return new
    }
}

fun main() {
    val fibRun1 = measureNanoTime { fib(1000) }
    val fibRun2 = measureNanoTime { fib(1000) }
    val fibRun3 = measureNanoTime { fib(500) }

    println("Fib first run: $fibRun1 (ns)")
    println("Fib second run: $fibRun2 (ns)")
    println("Fib third run: $fibRun3 (ns)")
}