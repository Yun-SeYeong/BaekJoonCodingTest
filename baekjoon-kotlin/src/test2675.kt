import java.io.BufferedReader
import java.io.InputStreamReader

class test2675 {
    companion object {
        fun test2675() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val count = Integer.parseInt(br.readLine())

            val result = ArrayList<String>()

            for (i in 1..count) {
                val ns = br.readLine().split(" ")

                val words = ns[1].toCharArray()
                var word = ""
                words.forEach {
                    for (j in 1..Integer.parseInt(ns[0])) {
                        word += it
                    }
                }
                result.add(word)
            }

            print(result.joinToString("\n"))

        }
    }
}