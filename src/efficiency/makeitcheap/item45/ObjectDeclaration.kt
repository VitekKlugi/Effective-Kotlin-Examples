package efficiency.makeitcheap.item45

sealed class LinkedList<out T>

class Node<T>(
val head: T,
val tail: LinkedList<T>
): LinkedList<T>()

class Empty<T>: LinkedList<T>()
//object Empty : LinkedList<Nothing>() // LinkedList<Nothing> is subtype of any LinkedList (is covariant see out modifier above)

fun main() {
    val list: LinkedList<Int> = Node(1, Node(2, Node(3, Empty())))
    val list2: LinkedList<String> = Node("A", Node("B", Empty())) // Empty list created unnecessary again
}
