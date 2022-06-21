import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.abs

class test11286 {
    fun test11286() {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val bw = BufferedWriter(OutputStreamWriter(System.out))

        val N = Integer.parseInt(br.readLine())

        val queue = PriorityQueue<Int>(compareBy({ abs(it) }, {it}))

        for (i in 0 until N) {
            val n = Integer.parseInt(br.readLine())
            if (n == 0) {
                if (queue.isEmpty()) {
                    bw.write("0\n")
                } else {
                    bw.write("${queue.poll()}\n")
                }

            } else {
                queue.add(n)
            }
        }
        bw.flush()
        bw.close()
    }
}