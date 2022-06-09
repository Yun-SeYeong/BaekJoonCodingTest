import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test9095 {
    companion object {
        data class Num(val index: Int, val target: Int, val current: Int)
        fun test9095() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val T = Integer.parseInt(br.readLine())

            val queue = LinkedList<Num>()

            for (i in 0 until T) {
                queue.add(Num(i, Integer.parseInt(br.readLine()), 0))
            }

            val count = IntArray(T)

            while(queue.isNotEmpty()) {
                val n = queue.pollFirst()
                for (i in 1..3) {
                    if (n.target == n.current + i) {
                        count[n.index]++
                    } else if (n.target > n.current + i) {
                        queue.add(Num(n.index, n.target, n.current + i))
                    }
                }
            }
            count.forEach {
                println(it)
            }
        }
    }
}