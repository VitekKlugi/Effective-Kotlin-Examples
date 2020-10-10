package codedesign.classdesign.item36

class CounterSetComposition<T>(private val innerSet: MutableSet<T> = mutableSetOf())  { // : MutableSet<T> by innerSet {
    var elementsAdded: Int = 0
        private set

    fun add(element: T): Boolean {
        elementsAdded++
        return innerSet.add(element)
    }

    fun addAll(elements: Collection<T>): Boolean {
        elementsAdded += elements.size
        return innerSet.addAll(elements)
    }
}

fun main() {
    val counterList = CounterSetComposition<String>()
    counterList.addAll(listOf("A", "B", "C"))
    println("Elements added = ${counterList.elementsAdded}") // 3

    // solution is not polymorphic
//    println(counterList.contains("B"))
//    println(counterList.size)
//    counterList.clear()
//    println(counterList.size)
}
