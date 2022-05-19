import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test1152 {
    companion object {
        fun test1152() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val st = StringTokenizer(br.readLine())

            var i = 0
            while (st.hasMoreTokens()) {
                i++
                st.nextToken()
            }
            print(i)
        }
    }
}