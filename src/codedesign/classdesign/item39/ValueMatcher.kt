package codedesign.classdesign.item39

sealed class ValueMatcher<T> {
    abstract fun match(value: T): Boolean

    class Equal<T>(val value: T) : ValueMatcher<T>() {
        override fun match(value: T): Boolean = value == this.value
    }

    class NotEqual<T>(val value: T) : ValueMatcher<T>() {
        override fun match(value: T): Boolean = value != this.value
    }

    class EmptyList<T> : ValueMatcher<T>() {
        override fun match(value: T) = value is List<*> && value.isEmpty()
    }

    class NotEmptyList<T> : ValueMatcher<T>() {
        override fun match(value: T) = value is List<*> && value.isNotEmpty()
    }
}

// we can easily add methods even as extensions
fun <T> ValueMatcher<T>.reversed(): ValueMatcher<T> = when (this) {
    is ValueMatcher.EmptyList -> ValueMatcher.NotEmptyList()
    is ValueMatcher.NotEmptyList -> ValueMatcher.EmptyList()
    is ValueMatcher.Equal -> ValueMatcher.NotEqual(value)
    is ValueMatcher.NotEqual -> ValueMatcher.Equal(value)
}

fun main() {
    println(ValueMatcher.Equal(1).match(1))
    println(ValueMatcher.EmptyList<List<Int>>().match(listOf()))
    println(ValueMatcher.NotEqual(1).match(1))
    println(ValueMatcher.NotEmptyList<List<Int>>().match(listOf()))

    println(ValueMatcher.NotEmptyList<List<Int>>().reversed().match(listOf()))
}