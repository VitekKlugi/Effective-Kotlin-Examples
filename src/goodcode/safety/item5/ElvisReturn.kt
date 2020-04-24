package goodcode.safety.item5

data class Person(val email: String? = null)

fun sendEmail(person: Person, text: String) {
    val email: String = person.email ?: run {
        println("Email not sent, no email address") // imagine proper logging
        return
    }

    println("Email sent to: ${email}, body: $text")
}

fun main() {
    sendEmail(Person(), "Ahoj")
    sendEmail(Person("person@gmail.com"), "Cau")
}