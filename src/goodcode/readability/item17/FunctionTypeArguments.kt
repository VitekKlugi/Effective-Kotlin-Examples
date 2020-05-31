package goodcode.readability.item17

fun call(before: () -> Unit = {}, after: () -> Unit = {}) {
    before()
    print("Middle")
    after()
}

fun main() {
    call({ println("CALL") }) // CALLMiddle
    call { println("CALL") } // MiddleCALL
}