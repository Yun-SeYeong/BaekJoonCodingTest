import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

class test2579 {
    companion object {
        fun test2579() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val N = Integer.parseInt(br.readLine())
            val list = IntArray(N)

            for (i in 0 until N) {
                list[i] = Integer.parseInt(br.readLine())
            }

            val dp = IntArray(N)
            dp[0] = list[0]

            if (list.size > 1) {
                dp[1] = list[1] + list[0]
            }

            if (list.size > 2) {
                dp[2] = max(list[0] + list[2], list[1] + list[2])
            }


            for (i in 3 until N) {
                dp[i] = max(dp[i-2] + list[i], dp[i-3] + list[i-1] + list[i])
//        println("i = ${i}")
//        println("dp[i] = ${dp[i]}")
            }

            print(dp[N-1])
        }
    }
}