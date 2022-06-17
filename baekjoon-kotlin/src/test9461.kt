import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class test9461 {
    companion object {
        fun test9461() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))
            val T = Integer.parseInt(br.readLine())

            val list = Array(101) {0L}
            list[1] = 1
            list[2] = 1
            list[3] = 1
            list[4] = 2
            list[5] = 2

            fun dp(n: Int): Long {
                return if (list[n] != 0L) {
                    list[n]
                } else if (n > 5L) {
                    list[n] = dp(n-1) + dp(n-5)
                    list[n]
                } else {
                    return 0L
                }
            }

            for (i in 0 until T) {
                val N = Integer.parseInt(br.readLine())
                bw.write("${dp(N)}\n")
            }
            bw.flush()
            bw.close()
        }
    }
}