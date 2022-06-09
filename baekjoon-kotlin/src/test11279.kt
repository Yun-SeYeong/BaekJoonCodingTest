import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class test11279 {
    companion object {
        fun test11279() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))

            val N = Integer.parseInt(br.readLine())

            val queue = PriorityQueue<Int>()

            for (i in 0 until N) {
                val a = Integer.parseInt(br.readLine())

                if (a == 0) {
                    if (!queue.isEmpty()) {
                        bw.write("${queue.poll()*-1}\n")
                    } else {
                        bw.write("0\n")
                    }
                } else {
                    queue.add(-1*a)
                }
            }
            bw.flush()
            bw.close()
        }
    }
}