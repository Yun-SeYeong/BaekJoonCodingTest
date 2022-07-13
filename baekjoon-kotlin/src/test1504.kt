import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test1504 {
    companion object {
        data class Line(val n: Int, val d: Int)
        data class Distance(val n: Int, val v: Int)
        fun test1504() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val st = StringTokenizer(br.readLine())

            val N = Integer.parseInt(st.nextToken())
            val E = Integer.parseInt(st.nextToken())

            var MAX_NUM = 0


            val array = Array<MutableList<Line>>(N+1) { mutableListOf() }


            for (i in 0 until E) {
                val st2 = StringTokenizer(br.readLine())

                val a = Integer.parseInt(st2.nextToken())
                val b = Integer.parseInt(st2.nextToken())
                val c = Integer.parseInt(st2.nextToken())

                MAX_NUM += c

                array[a].add(Line(b, c))
                array[b].add(Line(a, c))
            }

            val st3 = StringTokenizer(br.readLine())

            val passNode1 = Integer.parseInt(st3.nextToken())
            val passNode2 = Integer.parseInt(st3.nextToken())


            fun daik(s: Int, e: Int) : Int {

                val result = IntArray(N+1) { MAX_NUM + 1 }
                result[s] = 0

                val visit = BooleanArray(N+1)

                val queue = PriorityQueue<Distance>(compareBy { it.v })
                queue.add(Distance(s, 0))

                while (queue.isNotEmpty()) {
                    val n = queue.poll()

                    if (n.n == e) {
                        break
                    }

                    if (!visit[n.n]) {
                        array[n.n].forEach {
                            if (result[it.n] > result[n.n] + it.d) {
                                result[it.n] = result[n.n] + it.d
                            }
                            queue.add(Distance(it.n, result[it.n]))
                        }

                        visit[n.n] = true
                    }
                }

                return result[e]
            }

            val result = mutableListOf<Int>()

            val v1 = daik(1, passNode1)
            val v2 = daik(1, passNode2)

            val v3 = daik(passNode1, passNode2)

            val v4 = daik(passNode1, N)
            val v5 = daik(passNode2, N)

            if (v3 <= MAX_NUM) {
                if (v1 <= MAX_NUM && v5 <= MAX_NUM) {
                    result.add(v1 + v3 + v5)
                }

                if (v2 <= MAX_NUM && v4 <= MAX_NUM) {
                    result.add(v2 + v3 + v4)
                }
            }

            print(result.minOrNull()?:-1)
        }
    }
}