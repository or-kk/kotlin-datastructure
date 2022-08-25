package kotlinQueue

fun main() {
    val arrayQueue = ArrayQueueImpl<Int>().apply {
        enqueue(4)
        enqueue(11)
        enqueue(12)
    }
    println(arrayQueue)

    arrayQueue.dequeue()
    println(arrayQueue)

    println(arrayQueue.peek())

    arrayQueue.dequeue()
    println(arrayQueue)
}
