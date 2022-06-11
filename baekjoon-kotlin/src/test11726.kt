import java.io.BufferedReader
import java.io.InputStreamReader

class test11726 {
    companion object {
        fun test11726() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val n = Integer.parseInt(br.readLine())

            val dp = IntArray(n+1) {-1}


            fun dfs(a: Int): Int {
                if (a > 1) {
                    if (dp[a-1] == -1) {
                        dp[a-1] = dfs(a-1)
                    }

                    if (dp[a-2] == -1) {
                        dp[a-2] = dfs(a-2)
                    }

                    dp[a] = (dp[a-1] + dp[a-2]) % 10007
                    return dp[a]
                } else {
                    dp[a] = 1
                    return 1
                }
            }

            print(dfs(n))
        }
    }
}