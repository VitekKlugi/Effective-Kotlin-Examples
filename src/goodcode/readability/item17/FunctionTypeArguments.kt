package goodcode.readability.item17

fun call(before: () -> Unit = {}, after: () -> Unit = {}) {
    before()
    print("Middle")
    after()
}

fun main() {
    call({ print("CALL") }) // CALLMiddle
    println()
    call { print("CALL") } // MiddleCALL
}