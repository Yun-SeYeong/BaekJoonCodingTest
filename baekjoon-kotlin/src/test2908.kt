import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test2908 {
    companion object {
        fun test2908() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val st = StringTokenizer(br.readLine())

            val A = Integer.parseInt(st.nextToken().reversed())
            val B = Integer.parseInt(st.nextToken().reversed())

            if (A > B) {
                print(A)
            } else {
                print(B)
            }
        }
    }
}