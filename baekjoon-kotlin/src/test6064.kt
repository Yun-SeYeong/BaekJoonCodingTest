import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class test6064 {
    companion object {
        fun test6064() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))
            val T = Integer.parseInt(br.readLine())

            fun gcd(n1: Int, n2: Int): Int {
                if (n1 == 0) {
                    return n2
                }
                return gcd(n2 % n1, n1)
            }

            fun lcm(n1: Int, n2: Int): Int {
                return (n1 * n2) / gcd(n1, n2)
            }

            for (i in 0 until T) {
                val st = StringTokenizer(br.readLine())
                val M = Integer.parseInt(st.nextToken())
                val N = Integer.parseInt(st.nextToken())
                val x = Integer.parseInt(st.nextToken())
                val y = Integer.parseInt(st.nextToken())

                var n = x
                val n2 = y % N
                val end = lcm(M,N)
                var result = -1
                while(n <= end) {
                    if (n % N == n2) {
                        result = n
                        break
                    }
                    n+=M
                }
                bw.write("$result\n")
            }
            bw.flush()
            bw.close()
        }
    }
}