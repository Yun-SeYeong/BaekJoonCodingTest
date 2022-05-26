import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test11050 {
    companion object {
        fun test11050() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val st = StringTokenizer(br.readLine())

            val N = Integer.parseInt(st.nextToken())
            val K = Integer.parseInt(st.nextToken())

            print(fac(N) / (fac(K) * fac(N-K)))
        }
        fun fac(n: Int): Int{
            var v = 1
            for (i in 2..n) {
                v *= i
            }
            return v
        }
    }
}