import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class test10250 {
    companion object {
        fun test10250() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))

            val count = Integer.parseInt(br.readLine())

            for (i in 0 until count) {
                val st = StringTokenizer(br.readLine())

                val a = Integer.parseInt(st.nextToken())
                val b = st.nextToken()
                val c = Integer.parseInt(st.nextToken()) - 1

                val ca = c%a + 1

                val ac = c/a + 1

                var r = ""

                r += ca
                r += if (ac < 10) "0" else ""
                r += ac
                r += "\n"

                bw.write(r)

            }
            bw.flush()
            bw.close()
        }
    }
}