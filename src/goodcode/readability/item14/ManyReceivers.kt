package goodcode.readability.item14

class Node(val name: String) {

    fun makeChild(childName: String) =
        create("$name.$childName").apply { print("Created ${name}") } // also would be more appropriate, "Created ${this?.name} in ${this@Node.name}"

    fun create(name: String): Node? = Node(name)
}

fun main() {
    val node = Node("parent")

    // What is the result?
    node.makeChild("child")
}