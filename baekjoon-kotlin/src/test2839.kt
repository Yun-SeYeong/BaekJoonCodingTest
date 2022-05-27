import java.io.BufferedReader
import java.io.InputStreamReader

class test2839 {
    companion object {
        fun test2839() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val N = Integer.parseInt(br.readLine())

            for (i in 0 until (N/3) + 1) {
                val v = (N-(3*i))
                if (v % 5 == 0) {
                    print(v / 5 + i)
                    return
                }
            }
            print("-1")
        }
    }
}