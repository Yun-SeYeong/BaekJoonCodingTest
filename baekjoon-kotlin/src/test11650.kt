import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class test11650 {
    companion object {
        fun test11650() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))

            val count = Integer.parseInt(br.readLine())

            val list = LinkedList<Pair<Int, Int>>()

            for (i in 0 until count) {
                val st = StringTokenizer(br.readLine())

                list.add(Pair(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())))
            }

            list.sortWith(compareBy({it.first}, {it.second}))

            list.forEach {
                bw.write("${it.first} ${it.second}\n")
            }
            bw.flush()
            bw.close()
        }
    }
}