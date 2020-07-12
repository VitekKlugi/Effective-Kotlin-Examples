package codedesign.reusability.item24

sealed class Response<out R, out E>
class Success<out R>(val value: R): Response<R, Nothing>()
class Failure<out E>(val error: E): Response<Nothing, E>()

fun main() {
    val success = Success(5)
    val error = Failure("Chyba v Metrixu!")

    val generalSuccess: Success<Any> = success
    val generalError: Failure<Any> = error
    val generalResponse: Response<Any, Any> = success
}