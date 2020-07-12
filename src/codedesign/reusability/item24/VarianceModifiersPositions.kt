package codedesign.reusability.item24

class DeclarationSideBox<out T>(val value: T)
class UseSideBox<T>(val value: T)

fun main() {
    val declSideBox: DeclarationSideBox<String> = DeclarationSideBox("Str")
    val anyBox: DeclarationSideBox<Any> = declSideBox

    val boxStr: UseSideBox<String> = UseSideBox("Str")
    val boxAny: UseSideBox<out Any> = boxStr // Use-side variance modifier
}
