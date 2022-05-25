import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class test10816 {
    companion object {
        fun test10816() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))

            val mCount = Integer.parseInt(br.readLine())

            val map = HashMap<String, Int>()

            val st = StringTokenizer(br.readLine())

            for(i in 0 until mCount) {
                val v = st.nextToken()
                map[v] = map.getOrDefault(v, 0) + 1
            }

            val nCount = Integer.parseInt(br.readLine())

            val st2 = StringTokenizer(br.readLine())
            for(i in 0 until nCount) {
                val v = st2.nextToken()
                bw.write("${map.getOrDefault(v, 0)} ")
            }
            bw.flush()
            bw.close()
        }
    }
}