import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test1931 {
    companion object {
        fun test1931() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val N = Integer.parseInt(br.readLine())

            val list = Array(N) {
                val st = StringTokenizer(br.readLine())
                Pair(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))
            }

            list.sortWith(compareBy ({ it.second }, {it.first}) )

            var count = 0

            var tmp = 0

            for (i in 1 until N) {
                if (tmp <= list[i].first) {
                    tmp = list[i].second
                    count++
                }
            }

            print(count)
        }
    }
}