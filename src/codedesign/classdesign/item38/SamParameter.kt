package codedesign.classdesign.item38

fun // comment out fun and see what happens
interface Action {
    fun invoke(str: String)
}

class PrintAction : Action {
    override fun invoke(str: String) {
        println(str)
    }
}

fun runSamAction(action: Action) {
    action.invoke("Hello!")
}

fun main() {
    runSamAction { println(it) } // lambda expression
    runSamAction(::println) // function reference or bounded function reference, eg. this::DoSomething
    runSamAction(fun(str) { println(str) }) // anonymous function
    runSamAction(PrintAction()) // object implementing the declared function interface
}