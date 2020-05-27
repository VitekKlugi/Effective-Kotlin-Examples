package goodcode.readability.item11

operator fun String.invoke(f: ()->String): String = this + f()
infix fun String.and(s: String) = this + s

// It violates operator meaning - invoke should not be used this  way. A String cannot be invoked.
// The usage of the ‘lambda as the last argument’ convention here is confusing. It is fine to use it after functions, but we should be very careful when we use it for the invoke operator.
// and is clearly a bad name for this infix method. append or plus would be much better.
// We already have language features for String concatenation and we should use them instead of reinventing the wheel.