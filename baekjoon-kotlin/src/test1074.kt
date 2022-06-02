import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.pow

class test1074 {
    companion object {
        fun test1074() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val st = StringTokenizer(br.readLine())

            val N = Integer.parseInt(st.nextToken())
            val r = Integer.parseInt(st.nextToken())
            val c = Integer.parseInt(st.nextToken())

            var w = (2.0).pow(N)
            var b = (w.pow(2) / 4).toInt()
            var cw = w
            var rw = w

            var result = 0

            while(b >= 1) {
                if (r < rw/2 && c < cw/2) {
                    rw -= w / 2
                    cw -= w / 2
                } else if (r >= rw/2 && c < cw/2) {
                    result += b * 2
                    rw += w / 2
                    cw -= w / 2
                } else if (r < rw/2 && c >= cw/2) {
                    result += b * 1
                    rw -= w / 2
                    cw += w / 2
                } else if (r >= rw/2 && c >= cw/2) {
                    result += b * 3
                    cw += w / 2
                    rw += w / 2
                }
                b /= 4
                w /= 2
            }

            println(result)
        }
    }
}