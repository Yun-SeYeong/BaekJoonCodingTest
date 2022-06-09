import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.max

class test7576 {
    data class Tomato(var sec: Int, var x: Int, var y: Int)
    companion object {
        fun test7576() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val st = StringTokenizer(br.readLine())

            val M = Integer.parseInt(st.nextToken())
            val N = Integer.parseInt(st.nextToken())

            val map = Array(N) {IntArray(M)}
            val queue = LinkedList<Tomato>()

            var tomatoCount = 0

            for (i in 0 until N) {
                val st2 = StringTokenizer(br.readLine())

                for (j in 0 until M) {
                    map[i][j] = Integer.parseInt(st2.nextToken())
                    if (map[i][j] == 1) {
                        queue.add(Tomato(0, i, j))
                    } else if (map[i][j] == 0) {
                        tomatoCount++
                    }
                }
            }

            var time = 0
            var completeCount = -queue.size

            while(queue.isNotEmpty()) {
                val n = queue.pollFirst()
                completeCount++
                time = max(time, n.sec)

                if (n.x+1 < N && map[n.x+1][n.y] == 0) {
                    queue.add(Tomato(n.sec+1, n.x+1, n.y))
                    map[n.x+1][n.y] = 1
                }
                if (n.x-1 >= 0 && map[n.x-1][n.y] == 0) {
                    queue.add(Tomato(n.sec+1, n.x-1, n.y))
                    map[n.x-1][n.y] = 1
                }
                if (n.y+1 < M && map[n.x][n.y+1] == 0) {
                    queue.add(Tomato(n.sec+1, n.x, n.y+1))
                    map[n.x][n.y+1] = 1
                }
                if (n.y-1 >= 0 && map[n.x][n.y-1] == 0) {
                    queue.add(Tomato(n.sec+1, n.x, n.y-1))
                    map[n.x][n.y-1] = 1
                }
            }

            if (completeCount == tomatoCount) {
                print(time)
            } else {
                print("-1")
            }
        }
    }
}