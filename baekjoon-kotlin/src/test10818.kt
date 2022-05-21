import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test10818 {
    companion object {
        fun test10818() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            br.readLine()

            var min = 1000000
            var max = -1000000

            val st = StringTokenizer(br.readLine())

            while(st.hasMoreTokens()) {
                val n = Integer.parseInt(st.nextToken())
                if (min > n) {
                    min = n
                }
                if (max < n) {
                    max = n
                }
            }
            print("$min $max")
        }
    }
}