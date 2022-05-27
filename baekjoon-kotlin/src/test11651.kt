import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class test11651 {
    companion object {
        fun test11651() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))

            val count = Integer.parseInt(br.readLine())

            val list = Array(count) {Pair(0, 0)}

            for (i in 0 until count) {
                val st = StringTokenizer(br.readLine())

                val a = Integer.parseInt(st.nextToken())
                val b = Integer.parseInt(st.nextToken())

                list[i] = Pair(a, b)
            }

            list.sortWith(compareBy({it.second}, {it.first}))

            list.forEach {
                bw.write("${it.first} ${it.second}\n")
            }
            bw.flush()
            bw.close()
        }
    }
}