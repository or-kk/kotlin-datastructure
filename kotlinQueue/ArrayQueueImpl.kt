package kotlinQueue

class ArrayQueueImpl<T : Any> : ArrayQueue<T> {
    private val array = arrayListOf<T>()

    override fun enqueue(element: T): Boolean {
        array.add(element)
        return true
    }

    override fun dequeue(): T? {
        return if (array.isNotEmpty()) {
            array.removeAt(0)
        } else {
            null
        }
    }

    override fun peek(): T? {
        return array.getOrNull(0)
    }

    override fun toString(): String {
        return array.toString()
    }
}
