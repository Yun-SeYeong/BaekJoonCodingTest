import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class test10866 {
    companion object {
        fun test10866() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))

            val count = Integer.parseInt(br.readLine())

            val queue = LinkedList<String>()

            for (i in 0 until count) {
                val st = StringTokenizer(br.readLine())

                val m = st.nextToken()
                if (m == "push_front") {
                    val n = st.nextToken()
                    queue.addFirst(n)
                } else if (m == "push_back"){
                    val n = st.nextToken()
                    queue.addLast(n)
                } else if (m == "front") {
                    bw.write("${if (queue.isNotEmpty()) queue.first else "-1"}\n")
                } else if (m == "back") {
                    bw.write("${if (queue.isNotEmpty()) queue.last else "-1"}\n")
                } else if (m == "pop_front") {
                    if (queue.isNotEmpty()) {
                        bw.write("${queue.first}\n")
                        queue.removeFirst()
                    } else {
                        bw.write("-1\n")
                    }
                } else if (m == "pop_back") {
                    if (queue.isNotEmpty()) {
                        bw.write("${queue.last}\n")
                        queue.removeLast()
                    } else {
                        bw.write("-1\n")
                    }
                } else if (m == "size") {
                    bw.write("${queue.size}\n")
                } else if (m == "empty") {
                    bw.write("${if (queue.isEmpty()) "1" else "0"}\n")
                }
            }
            bw.flush()
            bw.close()
        }
        fun test10866_2() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))

            val count = Integer.parseInt(br.readLine())

            val queue = CustomLinkedList<String>()

            for (i in 0 until count) {
                val st = StringTokenizer(br.readLine())

                val m = st.nextToken()
                if (m == "push_front") {
                    val n = st.nextToken()
                    queue.addFirst(n)
                } else if (m == "push_back"){
                    val n = st.nextToken()
                    queue.addLast(n)
                } else if (m == "front") {
                    bw.write("${if (queue.isNotEmpty()) queue.first else "-1"}\n")
                } else if (m == "back") {
                    bw.write("${if (queue.isNotEmpty()) queue.last else "-1"}\n")
                } else if (m == "pop_front") {
                    if (queue.isNotEmpty()) {
                        bw.write("${queue.first}\n")
                        queue.removeFirst()
                    } else {
                        bw.write("-1\n")
                    }
                } else if (m == "pop_back") {
                    if (queue.isNotEmpty()) {
                        bw.write("${queue.last}\n")
                        queue.removeLast()
                    } else {
                        bw.write("-1\n")
                    }
                } else if (m == "size") {
                    bw.write("${queue.size}\n")
                } else if (m == "empty") {
                    bw.write("${if (queue.isEmpty()) "1" else "0"}\n")
                }
            }
            bw.flush()
            bw.close()
        }
    }

    class Node<T>(val data: T, var front: Node<T>? = null, var back: Node<T>? = null)
    class CustomLinkedList<T> {
        private var front: Node<T>? = null
        private var back: Node<T>? = null
        private var length: Int = 0

        fun isEmpty() = length <= 0

        fun isNotEmpty() = !isEmpty()

        val first: T?
            get() = if (front!=null) front!!.data else null

        val last: T?
            get() = if (back!=null) back!!.data else null

        val size: Int
            get() = length

        fun addFirst(n: T) {
            val node = Node(n)
            if (length == 0) {
                front = node
                back = node
            } else {
                front!!.front = node
                node.back = front
                front = node
            }
            length++
        }

        fun addLast(n: T) {
            val node = Node(n)
            if (length == 0) {
                front = node
                back = node
            } else {
                back!!.back = node
                node.front = back
                back = node
            }
            length++
        }

        fun removeLast(): T? {
            return if (length > 0) {
                val v = back!!.data
                length--
                back = back!!.front
                v
            } else {
                null
            }
        }

        fun removeFirst(): T? {
            return if (length > 0) {
                val v = front!!.data
                length--
                front = front!!.back
                v
            } else {
                null
            }
        }
    }
}