import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class test1920 {
    companion object {
        fun test1920() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))

            val map = HashMap<Int, Boolean>()

            val n = Integer.parseInt(br.readLine())
            val nst = StringTokenizer(br.readLine())

            for (i in 0 until n) {
                map[Integer.parseInt(nst.nextToken()) - 1] = true
            }

            val m = Integer.parseInt(br.readLine())
            val mst = StringTokenizer(br.readLine())

            for (i in 0 until m) {
                if (map[Integer.parseInt(mst.nextToken()) - 1] == true) {
                    bw.write("1\n")
                } else {
                    bw.write("0\n")
                }
            }
            bw.flush()
        }
    }
}