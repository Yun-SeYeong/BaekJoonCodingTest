import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class test17219 {
    companion object {
        fun test17219() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))
            val st = StringTokenizer(br.readLine())

            val N = Integer.parseInt(st.nextToken())
            val M = Integer.parseInt(st.nextToken())

            val map = HashMap<String, String>()

            for (i in 0 until N) {
                val st2 = StringTokenizer(br.readLine())
                map[st2.nextToken()] = st2.nextToken()
            }

            for (i in 0 until M) {
                bw.write("${map[br.readLine()]!!}\n")
            }

            bw.flush()
            bw.close()
        }
    }
}