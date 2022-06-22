import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test16928 {
    companion object {
        fun test16928() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val st = StringTokenizer(br.readLine())

            val N = Integer.parseInt(st.nextToken())
            val M = Integer.parseInt(st.nextToken())

            val map = HashMap<Int, Int>()
            val visit = BooleanArray(101)

            for (i in 0 until N+M) {
                val st2 = StringTokenizer(br.readLine())
                val u = Integer.parseInt(st2.nextToken())
                val v = Integer.parseInt(st2.nextToken())
                map[u] = v
            }

            val queue = LinkedList<Pos>()

            queue.add(Pos(1, 0))

            while(queue.isNotEmpty()) {
                val n = queue.pollFirst()

                if (n.n == 100) {
                    print(n.c)
                    break
                }

                if (!visit[n.n]) {
                    if (map[n.n] != null) {
                        n.n = map[n.n]!!
                    }

                    for (i in 1..6) {
                        queue.add(Pos(n.n+i, n.c+1))
                    }
                }
                visit[n.n] = true
            }
        }
    }
    data class Pos(var n: Int, val c: Int)
}