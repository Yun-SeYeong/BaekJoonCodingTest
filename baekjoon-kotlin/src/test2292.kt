import java.io.BufferedReader
import java.io.InputStreamReader

class test2292 {
    companion object {
        fun test2292() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val N = Integer.parseInt(br.readLine())

            var k = 0
            var i = 0

            while (k <= 1000000000) {
                k += (i*6)
                if (k + 1 >= N) {
                    print(i + 1)
                    break
                }
                i++
            }
        }
    }
}