import java.io.BufferedReader
import java.io.InputStreamReader

class test1676 {
    companion object {
        fun test1676() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val N = Integer.parseInt(br.readLine())

            println(N / 5 + N / 25 + N / 125)
        }
    }
}