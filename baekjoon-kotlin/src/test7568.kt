import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test7568 {
    companion object {
        fun test7568() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val count = Integer.parseInt(br.readLine())

            val map = HashMap<Int, Pair<Int, Int>>()

            for (i in 0 until count) {
                val st = StringTokenizer(br.readLine())
                map[i] = Pair(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))
            }

            val result = IntArray(count) {count}

            for (i in 0 until count) {
                for (j in 0 until count) {
                    if (i != j) {
                        if (map[i]!!.first >= map[j]!!.first || map[i]!!.second >= map[j]!!.second) {
                            result[i]--
                        }
                    }
                }
            }

            result.forEach { println(it) }
        }
    }
}