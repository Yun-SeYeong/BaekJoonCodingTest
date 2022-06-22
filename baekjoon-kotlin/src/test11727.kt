import java.io.BufferedReader
import java.io.InputStreamReader

class test11727 {
    companion object {
        fun test11727() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val n = Integer.parseInt(br.readLine())

            val dp = IntArray(10008)

            dp[1] = 1
            dp[2] = 3
            dp[3] = 5
            dp[4] = 11
            dp[5] = 21
            dp[6] = 43
            dp[7] = 85
            dp[8] = 171

            for (i in 3..n) {
                dp[i] = (dp[i-2]*2 + dp[i-1]) % 10007
            }

            println(dp[n])
        }
    }
}