package goodcode.readability.item13

fun keyIsCorrect(key: String): Boolean = false
fun verifyKey(key: String): Unit? = null    // isomorphic to Boolean but misleading and confusing


fun main() {
    if (!keyIsCorrect("key")) return

    verifyKey("key") ?: return
}