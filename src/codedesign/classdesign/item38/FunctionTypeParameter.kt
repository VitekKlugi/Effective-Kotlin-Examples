package codedesign.classdesign.item38

typealias StringOutput = (String) -> Unit
inline fun runStringAction(action: StringOutput) {
    action("Hello!")
}

class StringPrint : StringOutput {
    override fun invoke(str: String) {
        println(str)
    }
}

fun main() {
    runStringAction { println(it) } // lambda expression
    runStringAction(::println) // function reference or bounded function reference, eg. this::DoSomething
    runStringAction(fun(str) { println(str) }) // anonymous function
    runStringAction(StringPrint()) // object implementing the declared function type
}