import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.max

class test1238 {
    companion object {
        data class Line(val target: Int, val distance: Int)
        fun test1238() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val st = StringTokenizer(br.readLine())

            val N = Integer.parseInt(st.nextToken())
            val M = Integer.parseInt(st.nextToken())
            val X = Integer.parseInt(st.nextToken())

            val array = Array<MutableList<Line>>(N+1) { mutableListOf()}
            val array2 = Array<MutableList<Line>>(N+1) { mutableListOf()}

            for (i in 0 until M) {
                val st2 = StringTokenizer(br.readLine())
                val n1 = Integer.parseInt(st2.nextToken())
                val n2 = Integer.parseInt(st2.nextToken())
                val n3 = Integer.parseInt(st2.nextToken())
                array[n1].add(Line(n2, n3))
                array2[n2].add(Line(n1, n3))
            }


            fun dai(lines: Array<MutableList<Line>>): IntArray {
                val result = IntArray(N+1) { Int.MAX_VALUE }
                val queue = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
                val visit = BooleanArray(N + 1)
                queue.add(Pair(X, 0))
                result[X] = 0

                while(queue.isNotEmpty()) {
                    val node = queue.poll()

                    lines[node.first].forEach {
                        if (!visit[it.target]) {
                            if (result[it.target] > result[node.first] + it.distance) {
                                result[it.target] = result[node.first] + it.distance
                            }
                            queue.add(Pair(it.target, result[it.target]))
                        }
                    }
                    visit[node.first] = true
                }
                return result
            }

            val result = dai(array)
            val result2 = dai(array2)

//    println("result = ${result.contentToString()}")
//    println("result2 = ${result2.contentToString()}")

            var m = 0
            repeat(N) {
                m = max(m, result[it+1] + result2[it+1])
            }
            print(m)
        }
    }
}