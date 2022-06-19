import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test11047 {
    companion object {
        fun test11047() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val st = StringTokenizer(br.readLine())

            val N = Integer.parseInt(st.nextToken())
            val K = Integer.parseInt(st.nextToken())

            val list = IntArray(N)
            var last = 0

            for (i in 0 until N) {
                val n = Integer.parseInt(br.readLine())
                if (n <= K) {
                    list[i] = n
                    last = i
                } else {
                    break
                }
            }

            var remain = K
            var count = 0
            for (i in last downTo 0) {
                count += (remain / list[i])
                if (remain % list[i] > 0) {
                    remain %= list[i]
                } else {
                    break
                }
            }
            print(count)
        }
    }
}