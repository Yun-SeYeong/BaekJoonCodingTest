import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.pow

class test4153 {
    fun test4153() {
        val br = BufferedReader(InputStreamReader(System.`in`))

        var line = ""

        var stringBuilder = StringBuilder()

        line = br.readLine()

        while(line != "0 0 0") {
            val st = StringTokenizer(line)

            val a = st.nextToken().toDouble().pow(2)
            val b = st.nextToken().toDouble().pow(2)
            val c = st.nextToken().toDouble().pow(2)

            if (a + b == c || b + c == a || a + c == b) {
                stringBuilder.append("right\n")
            } else {
                stringBuilder.append("wrong\n")
            }
            line = br.readLine()
        }

        print(stringBuilder.trim())
    }
}