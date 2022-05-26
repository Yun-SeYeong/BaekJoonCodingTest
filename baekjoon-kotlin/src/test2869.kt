import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test2869 {
    companion object {
        fun test2869() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val st = StringTokenizer(br.readLine())

            val A = Integer.parseInt(st.nextToken())
            val B = Integer.parseInt(st.nextToken())
            val V = Integer.parseInt(st.nextToken())

            for (i in V..(V+A-1)) {
                if (((i-A) % (A-B)) == 0) {
                    println(((i-A) / (A-B)) + 1)
                    break
                }
            }
        }
    }
}