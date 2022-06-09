import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test2630 {
    companion object {
        fun test2630() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val N = Integer.parseInt(br.readLine())

            val map = Array(N) { IntArray(N) }

            for (i in 0 until N) {
                val st = StringTokenizer(br.readLine())
                for (j in 0 until N) {
                    map[i][j] = Integer.parseInt(st.nextToken())
                }
            }

            ////println("map = ${map}")

            val queue = LinkedList<Paper>()
            var count1 = 0
            var count2 = 0
            queue.add(Paper(N, 0, 0))

            while(queue.isNotEmpty()) {
                //println("queue = ${queue}")
                val n = queue.pollFirst()

                val first = map[n.x][n.y]
                var isOne = true

                for (i in n.x until n.x+n.size) {
                    for (j in n.y until n.y+n.size) {
                        if (map[i][j] != first) {
                            isOne = false
                        }
                    }
                    if (!isOne) {
                        break
                    }
                }

                if (!isOne) {
                    for (i in n.x until n.x+n.size step n.size/2) {
                        for (j in n.y until n.y+n.size step n.size/2) {
                            if (n.size/2 == 1) {
                                if (map[i][j] == 1) {
                                    count1++
                                } else {
                                    count2++
                                }
                            } else {
                                queue.add(Paper(n.size/2, i, j))
                            }

                        }
                    }
                } else {
                    if (first == 1) {
                        count1++
                    } else {
                        count2++
                    }
                }

                //println(count1)
                //println(count2)
            }

            println(count2)
            print(count1)
        }
        data class Paper(
            var size: Int,
            var x: Int,
            var y: Int)
    }
}