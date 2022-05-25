import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class test9012 {
    fun test9012() {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val bw = BufferedWriter(OutputStreamWriter(System.out))

        val count = Integer.parseInt(br.readLine())

        for (i in 0 until count) {
            val line = br.readLine()

            var v = 0
            var r = "YES"
            for (c in line.toCharArray()) {
                if (c == '(') {
                    v += 1
                }
                if (c == ')') {
                    v -= 1
                }

                if (v < 0) {
                    r = "NO"
                }
            }
            if (v > 0) {
                r = "NO"
            }
            bw.write("$r\n")
        }
        bw.flush()
        bw.close()
    }
}