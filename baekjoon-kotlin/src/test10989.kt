import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class test10989 {
    companion object {
        fun test10989() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))

            val count = Integer.parseInt(br.readLine())

            val list = IntArray(10001)

            for (i in 0 until count) {
                val n = Integer.parseInt(br.readLine())
                list[n] = list[n] + 1
            }

            for (i in 0 until 10001) {
                if(list[i] > 0) {
                    bw.write("${i}\n".repeat(list[i]))
                }
            }
            bw.flush()
            bw.close()
        }
    }
}