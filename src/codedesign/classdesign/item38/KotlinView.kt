package codedesign.classdesign.item38

class KotlinView {
    var onSomethingSelected: ((String) -> Unit)? = null
    var onSomethingClicked: OnSomethingClicked? = null
    var onClicked: Clicked? = null
}

interface OnSomethingClicked {
    fun onClick(str: String)
}

fun interface Clicked {
    fun onClick(str: String)
}