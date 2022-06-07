import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test1764 {
    companion object {
        fun test1764() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val st = StringTokenizer(br.readLine())

            val N = Integer.parseInt(st.nextToken())
            val M = Integer.parseInt(st.nextToken())

            val map = HashMap<String, Boolean>()
            var list = mutableListOf<String>()

            for (i in 0 until N) {
                map[br.readLine()] = true
            }

            for (i in 0 until M) {
                val name = br.readLine()
                if (map.getOrDefault(name, false)) {
                    list.add(name)
                }
            }
            list.sort()
            print("${list.size}\n${list.joinToString("\n")}")
        }
    }
}