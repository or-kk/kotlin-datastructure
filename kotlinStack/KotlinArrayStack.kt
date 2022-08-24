package kotlinStack

fun main() {
    val arrayStack = ArrayStackImpl<Int>().apply {
        push(7)
        push(11)
        push(21)
    }
    println(arrayStack)

    arrayStack.pop()
    println(arrayStack)

    arrayStack.pop()
    println(arrayStack)

    arrayStack.peek()
    println(arrayStack)
}
