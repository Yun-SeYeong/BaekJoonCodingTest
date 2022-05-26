import java.io.BufferedReader
import java.io.InputStreamReader

class test2231 {
    companion object {
        fun test2231() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val N = Integer.parseInt(br.readLine())
            val len = N.toString().length
            var result = 0

            var min = N-(9*len)
            min = if (min < 0) 0 else min

            for (i in min..N) {
                val sum = i.toString().toCharArray().sumOf {
                    Integer.parseInt(it.toString())
                } + i

                if (sum == N) {
                    result = i
                    break
                }
            }

            print(result)
        }
    }
}