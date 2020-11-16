package codedesign.classdesign.item38

// typealias StringOutput = (String) -> Unit
inline fun runStringAction(action: (String) -> Unit) {
    action("Hello!")
}

class PrintAction: (String) -> Unit {
    override fun invoke(str: String) {
        println(str)
    }
}

fun main() {
    runStringAction { println(it) } // lambda expression
    runStringAction(::println) // function reference or bounded function reference, eg. this::DoSomething
    runStringAction(fun(str) { println(str) }) // anonymous function
    runStringAction(PrintAction()) // object implementing the declared function type
}