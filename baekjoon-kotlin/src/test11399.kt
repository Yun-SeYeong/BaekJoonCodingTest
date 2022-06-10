import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test11399 {
    companion object {
        fun test11399() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val N = Integer.parseInt(br.readLine())
            val st = StringTokenizer(br.readLine())

            val list = Array(N) { Integer.parseInt(st.nextToken()) }

            var result = 0

            list.sorted().forEachIndexed { i, v ->
                result += v * (N-i)
            }
            print(result)
        }
    }
}