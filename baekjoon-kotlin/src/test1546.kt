import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test1546 {
    companion object {
        fun test1546() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val count = Integer.parseInt(br.readLine())

            val list = br.readLine().split(" ")

            val max = list.maxOf { s: String -> Integer.parseInt(s) }

            var total = 0.0

            list.forEach {
                total += (Integer.parseInt(it).toDouble()/max)*100
            }

            print(total/count)
        }
    }
}