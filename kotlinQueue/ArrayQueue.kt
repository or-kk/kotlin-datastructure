package kotlinQueue

interface ArrayQueue<T> {
    fun enqueue(element: T): Boolean
    fun dequeue(): T?
    fun peek(): T?
}
