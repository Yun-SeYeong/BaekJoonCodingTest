import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class test10828 {
    companion object {
        fun test10282() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))

            val stack = Stack<Int>()

            val count = Integer.parseInt(br.readLine())

            for (i in 0 until count) {
                val st = StringTokenizer(br.readLine())

                val m = st.nextToken()

                if (m == "push") {
                    val n = Integer.parseInt(st.nextToken())
                    stack.push(n)
                } else if (m == "pop") {
                    bw.write("${if (stack.isEmpty()) "-1" else stack.pop()}\n")
                } else if (m == "size") {
                    bw.write("${stack.size}\n")
                } else if (m == "empty") {
                    bw.write(if (stack.isEmpty()) "1\n" else "0\n")
                } else if (m == "top") {
                    bw.write("${if (stack.isEmpty()) "-1" else stack.get(stack.size - 1)}\n")
                }
            }
            bw.flush()
            bw.close()
        }
    }
}