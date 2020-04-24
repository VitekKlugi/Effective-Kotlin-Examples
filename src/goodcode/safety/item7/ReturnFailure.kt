package goodcode.safety.item7

sealed class Result<out T>
class Success<out T>(val result: T) : Result<T>()
class Failure(val throwable: Throwable) : Result<Nothing>()

class ParsingException : Exception()

inline fun <reified T> String.readObject(): Result<T> {
    // fake ugly dirty parser
    val incorrectSign = this.isBlank()
    val result = T::class.constructors.first().call(this)

    if (incorrectSign) {
        return Failure(ParsingException())
    }

    return Success(result)
}

data class Person(val name: String)

fun main() {
    val name = when(val result = "Karel".readObject<Person>()) {
        is Failure -> "Exception: ${result.throwable}"
        is Success -> result.result.name
    }

    print(name)
}