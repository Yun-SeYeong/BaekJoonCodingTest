import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class test1620 {
    companion object {
        fun test1620() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))
            val st = StringTokenizer(br.readLine())

            val N = Integer.parseInt(st.nextToken())
            val M = Integer.parseInt(st.nextToken())

            val list = Array(N+1) { "" }
            val map = HashMap<String, Int>()

            for (i in 1..N) {
                val name = br.readLine()
                list[i] = name
                map[name] = i
            }

            for (i in 0 until M) {
                val line = br.readLine()
                if (line[0].isDigit()) {
                    bw.write("${list[line.toInt()]}\n")
                } else {
                    bw.write("${map[line]}\n")
                }
            }
            bw.flush()
            bw.close()
        }
    }
}