import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class test11659 {
    companion object {
        fun test11659() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))
            val st = StringTokenizer(br.readLine())
            val N = Integer.parseInt(st.nextToken())
            val M = Integer.parseInt(st.nextToken())

            val list = IntArray(N)

            br.readLine().split(" ").forEachIndexed { index, s ->
                if (index == 0) {
                    list[0] = Integer.parseInt(s)
                } else {
                    list[index] = list[index-1] + Integer.parseInt(s)
                }
            }

//    println("list.contentToString() = ${list.contentToString()}")

            for (i in 0 until M) {
                val st2 = StringTokenizer(br.readLine())

                val n1 = Integer.parseInt(st2.nextToken())
                val n2 = Integer.parseInt(st2.nextToken())

                val v = if (n1-2 >= 0) list[n1-2] else 0


                bw.write("${list[n2 - 1] - v}\n")
            }
            bw.flush()
            bw.close()
        }
    }
}