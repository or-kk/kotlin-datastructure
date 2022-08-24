package kotlinStack

interface ArrayStack<T : Any> {
    fun push(element: T)
    fun pop(): T?
    fun peek(): T?
}
