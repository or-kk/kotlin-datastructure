package kotlinStack

class ArrayStackImpl<T: Any> : ArrayStack<T> {
    private val array = arrayListOf<T>()

    override fun push(element: T) {
        array.add(element)
    }

    override fun pop(): T? {
        if (array.isEmpty()) {
            return null
        }
        return array.removeAt(array.size - 1)
    }

    override fun peek(): T? {
        return array.lastOrNull()
    }

    override fun toString(): String {
        return array.asReversed().toString()
    }
}
