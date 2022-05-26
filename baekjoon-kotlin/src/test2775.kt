import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class test2775 {
    companion object {
        fun test2275() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))

            val count = Integer.parseInt(br.readLine())

            for (i in 0 until count) {
                val a = Integer.parseInt(br.readLine())
                val b = Integer.parseInt(br.readLine())

                val list = IntArray(b) {n -> n+1}
                for (j in 0 until a) {
                    for (x in 1 until b) {
                        list[x] = list[x-1] + list[x]
                    }
                }

                bw.write("${list[list.size-1]}\n")
            }
            bw.flush()
            bw.close()
        }
    }
}