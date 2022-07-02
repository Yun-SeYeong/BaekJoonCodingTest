import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test1167 {
    companion object {
        fun test1167() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val V = Integer.parseInt(br.readLine())

            val map = HashMap<Int, MutableList<Line>>()

            repeat(V) {
                val st = StringTokenizer(br.readLine())
                val k = Integer.parseInt(st.nextToken())
                var n = Integer.parseInt(st.nextToken())
                while (n != -1) {
                    val d = Integer.parseInt(st.nextToken())
                    map[k] = map.getOrDefault(k, mutableListOf()).apply {
                        add(Line(d, n))
                    }
                    n = Integer.parseInt(st.nextToken())
                }
            }


            var result = 0
            var last = 1

            repeat(2) {
                val queue = LinkedList<Pos>()
                val visit = BooleanArray(V+1)
                queue.add(Pos(last, 0))

                while(queue.isNotEmpty()) {
                    val l = queue.pollLast()
                    val lines = map[l.n]!!
                    visit[l.n] = true

                    if (l.n > result){
                        result = l.d
                    }

                    for (i in 0 until lines.size) {
                        val n = lines[i].n
                        val d = lines[i].distance
                        if (!visit[n]){
                            queue.add(Pos(n, d + l.d))
                            if (d + l.d > result){
                                result = d + l.d
                                last = n
                            }
                        }
                    }
                }
            }

            print(result)
        }
    }
    data class Line(val distance: Int, val n: Int)
    data class Pos(val n: Int, val d: Int)
}