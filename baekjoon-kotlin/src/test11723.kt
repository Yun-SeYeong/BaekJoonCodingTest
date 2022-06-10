import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class test11723 {
    companion object {
        fun test11723() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))
            val M = Integer.parseInt(br.readLine())

            var list = BooleanArray(21)

            for (i in 0 until M) {
                val st = StringTokenizer(br.readLine(), " ")

//        println("st.toString = ${st.toList().toString()}")

                val method = st.nextToken()
                if (method == "add") {
                    val n = Integer.parseInt(st.nextToken())
                    list[n] = true
                } else if (method == "check") {
                    val n = Integer.parseInt(st.nextToken())
                    if (list[n]) {
                        bw.write("1\n")
                    } else {
                        bw.write("0\n")
                    }
                } else if (method == "remove") {
                    val n = Integer.parseInt(st.nextToken())
                    list[n] = false
                } else if (method == "toggle") {
                    val n = Integer.parseInt(st.nextToken())
                    list[n] = !list[n]
                } else if (method == "all") {
                    list = BooleanArray(21) { true }
                } else if (method == "empty") {
                    list = BooleanArray(21)
                }
            }
            bw.flush()
            bw.close()
        }
    }
}