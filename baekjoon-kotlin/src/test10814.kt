import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test10814 {
    companion object {
        fun test10814() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val count = Integer.parseInt(br.readLine())

            val list = Array(200) { StringBuilder() }

            for (i in 0 until count) {
                val st = StringTokenizer(br.readLine())

                val a = Integer.parseInt(st.nextToken())
                val k = st.nextToken()

                list[a-1].append("$a $k\n")
            }

            list.forEach {
                if (it.isNotEmpty()) {
                    print(it)
                }
            }
        }
    }
}