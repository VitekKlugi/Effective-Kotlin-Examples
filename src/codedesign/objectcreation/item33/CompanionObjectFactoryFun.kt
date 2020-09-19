package codedesign.objectcreation.item33

interface MyList<T> {
    // ...
    companion object {
        fun <T> of(vararg elements: T): MyList<T>? {
            return MyArrayList(*elements)
        }
    }
}

class MyLinkedList2<T>(
    val head: T,
    val tail: MyList<T>?
) : MyList<T> {
    companion object {
        fun <T> of(vararg elements: T): MyList<T>? {
            if (elements.isEmpty()) return null

            val head = elements.first()
            val elementsTail = elements.copyOfRange(1, elements.size)
            val tail = of(*elementsTail)

            return MyLinkedList2(head, tail)
        }
    }

    override fun toString(): String {
        return "MyLinkedList2(head= $head, tail= $tail)"
    }
}

class MyArrayList<T>(vararg elements: T) : MyList<T> {
    private val arrayList = arrayListOf(*elements)

    override fun toString(): String {
        return arrayList.toString()
    }
}

fun main() {
    val myList = MyList.of(1, 2, 3)
    println(myList)

    val list = MyLinkedList2.of(1, 2)
    println(list)
}