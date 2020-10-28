package codedesign.classdesign.item44

// Implicit access to both receivers might be confusing
class A {
    val a = 10
}

class B {
    val a = 20
    val b = 30

    fun A.test() = a + b // Is it 40 or 50?
    fun A.update() {} // shell update A (receiver) or B (dispatch receiver)?
}

fun main() {
    val a = A()
    val b = B()

    b.run { println(a.test()) }
}