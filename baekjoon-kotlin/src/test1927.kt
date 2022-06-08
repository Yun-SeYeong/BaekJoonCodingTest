import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class test1927 {
    companion object {
        fun test1927() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))
            val N = Integer.parseInt(br.readLine())

            val nums = PriorityQueue<Int>()

            for (i in 0 until N) {
                val n = Integer.parseInt(br.readLine())

                if (n != 0) {
                    nums.add(n)
                } else {
                    if (nums.isEmpty()) {
                        bw.write("0\n")
                    } else {
                        bw.write("${nums.poll()}\n")
                    }
                }
            }
            bw.flush()
            bw.close()
        }
    }
}