package codedesign.objectcreation.item33

// data class just for sake of the example - gives toString for free
data class MyLinkedList<T>(
    val head: T,
    val tail: MyLinkedList<T>?
)

fun <T> myLinkedListOf(
    vararg elements: T
): MyLinkedList<T>? {
    if (elements.isEmpty()) return null

    val head = elements.first()
    val elementsTail = elements.copyOfRange(1, elements.size)
    val tail = myLinkedListOf(*elementsTail)
    return MyLinkedList(head, tail)
}

fun main() {
    val list = MyLinkedList(1, MyLinkedList(2, null))
    println(list)
    val list2 = myLinkedListOf(1,2,3,4)
    println(list2)
}
