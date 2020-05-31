package goodcode.readability.item16

sealed class Tree<T>
class Leaf<T>(val value: T): Tree<T>()
class Node<T>(val left: Tree<T>, val right: Tree<T>): Tree<T>()

// DON’T DO THIS!
val Tree<Int>.sum: Int
    get(): Int = when(this) {
        is Leaf -> value
        is Node -> left.sum + right.sum
    }

fun main() {
    val simpleTree = Node(Leaf(1), Leaf(2))
    print(simpleTree.sum)
}