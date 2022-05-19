import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test2475 {
    companion object {
        fun test2475() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            var total = 0
            val st = StringTokenizer(br.readLine())

            while(st.hasMoreTokens()) {
                val n = Integer.parseInt(st.nextToken())
                total += n * n
            }

            print(total % 10)
        }
    }
}