import java.io.BufferedReader
import java.io.InputStreamReader

class test10952 {
    companion object {
        fun test10952() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val result = ArrayList<Int>()

            while (true) {
                val line = br.readLine()
                val sep = line.split(" ")

                if (line == "0 0") {
                    break
                }

                result.add(Integer.parseInt(sep[0]) + Integer.parseInt(sep[1]))
            }
            print(result.joinToString("\n"))
        }
    }
}