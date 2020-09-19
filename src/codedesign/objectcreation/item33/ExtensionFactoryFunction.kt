package codedesign.objectcreation.item33

interface Tool {
    companion object { /* companion object we can't change, e.g. different lib */ }
}

class BigTool : Tool

fun Tool.Companion.createBigTool(): BigTool = BigTool().also { print("Big Tool created = $it") }

fun main() {
    Tool.createBigTool()
}