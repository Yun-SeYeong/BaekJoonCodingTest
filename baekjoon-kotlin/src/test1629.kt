import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test1629 {
    companion object {
        fun test1629() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val st = StringTokenizer(br.readLine())

            val A = st.nextToken().toLong()
            val B = st.nextToken().toLong()
            val C = st.nextToken().toLong()

            fun pow(v: Long, n: Long): Long {
                if (n == 0L) {
                    return 1
                }
                val tmp = pow(v, n/2)

                return (if (n % 2L == 0L) {
                    tmp * tmp
                } else {
                    ((tmp * tmp)%C) * v
                }) % C
            }

            fun pow2(v: Long, n: Long): Long {
                var result = 1L



                return result
            }

            print(pow(A, B))
        }
    }
}