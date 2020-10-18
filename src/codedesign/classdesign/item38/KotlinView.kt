package codedesign.classdesign.item38

class KotlinView {
    var onSomethingSelected: ((String) -> Unit)? = null
    var onSomethingClicked: OnSomethingClicked? = null
}

interface OnSomethingClicked {
    fun onClick(str: String)
}