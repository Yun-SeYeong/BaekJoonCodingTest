import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class test1753 {
    data class Line(val n: Int, val d: Int)
    companion object {
        fun test1753() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))
            val st = StringTokenizer(br.readLine())

            val V = Integer.parseInt(st.nextToken())
            val E = Integer.parseInt(st.nextToken())

            val K = Integer.parseInt(br.readLine())

            val INF = Int.MAX_VALUE

            val map =  Array<MutableList<Line>>(V+1) { mutableListOf() }

            for (i in 0 until E) {
                val st2 = StringTokenizer(br.readLine())

                val u = Integer.parseInt(st2.nextToken())
                val v = Integer.parseInt(st2.nextToken())
                val w = Integer.parseInt(st2.nextToken())

                map[u].add(Line(v, w))
            }

            fun daijk(s: Int){
                val result = IntArray(V+1) {INF}
                val visit = BooleanArray(V+1)
                val queue = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
                queue.add(Pair(s, 0))
                result[s] = 0

                while(queue.isNotEmpty()) {
                    val v = queue.poll()

                    if (!visit[v.first]) {
                        map[v.first].forEach {
                            if (!visit[v.first] && result[it.n] > result[v.first] + it.d) {
                                result[it.n] = result[v.first] + it.d
                                queue.add(Pair(it.n, result[it.n]))
                            }
                        }
                        visit[v.first] = true
                    }
                }
                for(i in 1..V) {
                    if (result[i] == INF) {
                        bw.write("INF\n")
                    } else {
                        bw.write("${result[i]}\n")
                    }
                }
            }

            daijk(K)
            bw.flush()
            bw.close()
        }
    }
}