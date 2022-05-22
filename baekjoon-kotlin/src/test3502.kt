import java.io.BufferedReader
import java.io.InputStreamReader

class test3502 {
    companion object {
        fun test3502() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val array = ArrayList<Int>()
            for(i in 1..10) {
                array.add(Integer.parseInt(br.readLine()))
            }

            val check = BooleanArray(42)
            var result = 0

            for (a in array) {
                val n = a % 42
                if (!check[n]) {
                    check[n] = true
                    result++
                }
            }
            print(result)
        }
    }
}