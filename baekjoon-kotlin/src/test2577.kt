import java.io.BufferedReader
import java.io.InputStreamReader

class test2577 {
    companion object {
        fun test2577() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val A = Integer.parseInt(br.readLine())
            val B = Integer.parseInt(br.readLine())
            val C = Integer.parseInt(br.readLine())

            val M = (A * B * C).toString()

            val result = IntArray(10)

            for (c in M.toCharArray()) {
                val n =  Integer.parseInt(c.toString())
                result[n] = result[n] + 1
            }

            result.forEach {
                println(it)
            }
        }
    }
}