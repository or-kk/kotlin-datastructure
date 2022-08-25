package kotlinQueue

import java.util.LinkedList
import java.util.Queue

fun main() {
    val queue: Queue<Int> = LinkedList<Int>()

    queue.add(3)
    queue.add(5)
    queue.add(6)

    print(queue)

    queue.remove()
    print(queue)

    queue.remove()
    print(queue)

    queue.peek()
    print(queue)
}
