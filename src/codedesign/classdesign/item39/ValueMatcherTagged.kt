package codedesign.classdesign.item39

class ValueMatcherTagged<T> private constructor(
    private val value: T? = null,
    private val matcher: Matcher
) {

    fun match(value: T?) = when (matcher) {
        Matcher.EQUAL -> value == this.value
        Matcher.NOT_EQUAL -> value != this.value
        Matcher.LIST_EMPTY -> value is List<*> && value.isEmpty()
        Matcher.LIST_NOT_EMPTY -> value is List<*> && value.isNotEmpty()
    }

    enum class Matcher {
        EQUAL,
        NOT_EQUAL,
        LIST_EMPTY,
        LIST_NOT_EMPTY
    }

    companion object {
        fun <T> equal(value: T) =
            ValueMatcherTagged(
                value = value,
                matcher = Matcher.EQUAL
            )

        fun <T> notEqual(value: T) =
            ValueMatcherTagged(
                value = value,
                matcher = Matcher.NOT_EQUAL
            )

        fun <T> emptyList() = ValueMatcherTagged<T>(matcher = Matcher.LIST_EMPTY)

        fun <T> notEmptyList() = ValueMatcherTagged<T>(matcher = Matcher.LIST_NOT_EMPTY)
    }
}

fun main() {
    println(ValueMatcherTagged.equal(1).match(1))
    println(ValueMatcherTagged.emptyList<List<Int>>().match(listOf()))
    println(ValueMatcherTagged.notEqual(1).match(1))
    println(ValueMatcherTagged.notEmptyList<List<Int>>().match(listOf()))
}