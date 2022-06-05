import java.io.BufferedReader
import java.io.InputStreamReader

class test1541 {
    companion object {
        fun test1541() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val line = br.readLine()

            print(line.split("-").mapIndexed { index, value ->
                if (index == 0) {
                    value.split("+").sumOf(Integer::parseInt)
                } else {
                    -value.split("+").sumOf(Integer::parseInt)
                }
            }.sum())
        }
    }
}