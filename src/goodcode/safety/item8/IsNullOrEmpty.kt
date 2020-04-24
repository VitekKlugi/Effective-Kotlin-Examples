package goodcode.safety.item8

fun main() {
    val news: List<String>? = null

    if (!news.isNullOrEmpty()) {  // no compiler error, why?
        news.forEach { print(it.toUpperCase()) } // smart casting
    }
}