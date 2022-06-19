import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class test9375 {
    companion object {
        fun test9375() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))
            val T = Integer.parseInt(br.readLine())

            for (i in 0 until T) {
                val map = HashMap<String, Int>()
                val N = Integer.parseInt(br.readLine())

                for (j in 0 until N) {
                    val st = StringTokenizer(br.readLine())
                    st.nextToken()
                    val type = st.nextToken()
                    map[type] = map.getOrDefault(type, 0) + 1
                }

                var result = 1
                map.entries.forEach {
                    result *= (it.value + 1)
                }
                bw.write("${result-1}\n")

            }
            bw.flush()
            bw.close()
        }
    }
}