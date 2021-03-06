import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class test10845 {
    companion object {
        fun test10845() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))

            val count = Integer.parseInt(br.readLine())

            val queue = LinkedList<String>()

            for (i in 0 until count) {
                val st = StringTokenizer(br.readLine())

                val m = st.nextToken()
                if (m == "push") {
                    val n = st.nextToken()
                    queue.addFirst(n)
                } else if (m == "front") {
                    bw.write("${if (queue.isNotEmpty()) queue.last else "-1"}\n")
                } else if (m == "back") {
                    bw.write("${if (queue.isNotEmpty()) queue.first else "-1"}\n")
                } else if (m == "pop") {
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