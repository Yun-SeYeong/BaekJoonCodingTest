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
    }
}