import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test1157 {
    companion object {
        fun test1157() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val word = br.readLine().uppercase(Locale.getDefault()).toCharArray()

            val m = mutableMapOf<Char, Int>()

            word.forEach {
                m[it] = m.getOrDefault(it, 0) + 1
            }

            var maxKey: Char? = null
            var maxVal = 0

            m.toList().forEach {
                if (it.second >= maxVal) {
                    maxKey = if (maxVal == it.second) {
                        '?'
                    } else {
                        it.first
                    }
                    maxVal = it.second
                }
            }

            print(maxKey)
        }
    }
}