import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test11866 {
    fun test11866() {
        val br = BufferedReader(InputStreamReader(System.`in`))

        val st = StringTokenizer(br.readLine())

        val n = Integer.parseInt(st.nextToken())
        val k = Integer.parseInt(st.nextToken())

        val list = LinkedList<Int>()

        for (i in 1..n) {
            list.add(i)
        }

        val result = IntArray(n)

        var index = 0
        for (i in 0 until n) {
            index = (index + k - 1) % list.size
//        println(list.toString())

            result[i] = list[index]
            list.removeAt(index)
        }

        print("<${result.joinToString(", ")}>")
    }
}