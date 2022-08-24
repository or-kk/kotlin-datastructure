import java.util.Stack

fun main() {
    val stack = Stack<Int>()

    // Pushes an item onto the top of this stack.
    stack.push(23)
    stack.push(34)
    stack.push(11)

    println(stack)

    // Removes the object at the top of this stack and returns that object as the value of this function.
    stack.pop()
    println(stack)

    stack.pop()
    println(stack)

    // Tests if this stack is empty.
    if (stack.empty()) {
        println("empty stack")
    } else {
        // Looks at the object at the top of this stack without removing it from the stack.
        println(stack.peek())
    }
}
