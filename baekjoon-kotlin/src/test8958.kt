import java.io.BufferedReader
import java.io.InputStreamReader

class test8958 {
    companion object {
        fun test8958() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val count = Integer.parseInt(br.readLine())

            val lines = ArrayList<String>()
            for (i in 1..count) {
                lines.add(br.readLine())
            }

            for (line in lines) {
                var total = 0
                var c = 0

                for (l in line) {
                    if (l == 'O') {
                        c += 1
                        total += c
                    } else {
                        c = 0
                    }
                }
                println(total)
            }
        }
    }
}