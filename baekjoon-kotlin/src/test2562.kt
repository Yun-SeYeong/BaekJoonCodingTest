import java.io.BufferedReader
import java.io.InputStreamReader

class test2562 {
    companion object {
        fun test2562() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            var max = 0
            var index = 0

            for (i in 1..9) {
                val n = Integer.parseInt(br.readLine())

                if (max < n) {
                    max = n
                    index = i
                }
            }
            println(max)
            println(index)
        }
    }
}