import java.io.BufferedReader
import java.io.InputStreamReader

class test11720 {
    companion object {
        fun test11720() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            br.readLine()

            val line = br.readLine()

            var result = 0

            for (c in line.toCharArray()) {
                result += Integer.parseInt(c.toString())
            }

            println(result)
        }
    }
}