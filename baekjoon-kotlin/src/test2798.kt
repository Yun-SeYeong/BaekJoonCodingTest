import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test2798 {
    companion object {
        fun test2798() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val line = br.readLine().split(" ")

            val N = Integer.parseInt(line[0])
            val M = Integer.parseInt(line[1])

            val input = IntArray(N)

            val st = StringTokenizer(br.readLine())

            for (i in 0 until N) {
                input[i] = Integer.parseInt(st.nextToken())
            }

            var maxValue = 0

            for (i in 0 until (N)) {
                for (j in (i+1) until N) {
                    for (z in (j+1) until N) {
                        val r = input[i] + input[j] + input[z]
                        if (r == M) {
                            print(r)
                            return
                        }
                        if (r in (maxValue + 1) until M) {
                            maxValue = r
                        }
                    }
                }
            }

            print(maxValue)
        }
    }
}