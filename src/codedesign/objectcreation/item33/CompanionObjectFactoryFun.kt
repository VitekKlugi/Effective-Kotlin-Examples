package codedesign.objectcreation.item33

interface MyList<T> {
    // ...

    companion object {
        fun <T> of(vararg elements: T): MyList<T>? {
            return null
        }
    }
}

class MyLinkedList<T>(
    val head: T,
    val tail: MyLinkedList<T>?
) : MyList<T> {

}

fun main() {
    val myList = MyList.of(1,2,3)
    print(myList)
    val list = listOf(1,2)
    print(list.javaClass)
}