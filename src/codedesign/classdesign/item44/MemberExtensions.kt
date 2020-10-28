package codedesign.classdesign.item44

interface PhoneBook {
    fun String.isPhoneNumber(): Boolean
}

class PhoneBookImpl : PhoneBook {
    override fun String.isPhoneNumber(): Boolean =
        length == 7 && all { it.isDigit() }

    fun checkNumber(number: String): Boolean = number.isPhoneNumberPrivate()

    private fun String.isPhoneNumberPrivate() = isPhoneNumber()

    // Reference is not supported!
//    private val ref = String::isPhoneNumber // ERROR
//    private val defaultNumber = "1234567"
//    private val boundedRef = defaultNumber::isPhoneNumber // ERROR
}

fun main() {
    val phoneBook = PhoneBookImpl()

//    phoneBook.isPhoneNumber() // ERROR
//    "1234567".isPhoneNumber() // ERROR
    phoneBook.run { println("1234567".isPhoneNumber()) }  // it only makes it more complicated to use

    println(phoneBook.checkNumber("12345678"))
}