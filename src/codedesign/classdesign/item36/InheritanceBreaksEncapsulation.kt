package codedesign.classdesign.item36

class CounterSetInherited<T> : HashSet<T>() {
    var elementsAdded: Int = 0
        private set

    override fun add(element: T): Boolean {
        elementsAdded++
        return super.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        elementsAdded += elements.size
        return super.addAll(elements)
    }
}

fun main() {
    val counterList = CounterSetInherited<String>()
    counterList.addAll(listOf("A", "B", "C"))
    print("Elements added = ${counterList.elementsAdded}") // 6
}