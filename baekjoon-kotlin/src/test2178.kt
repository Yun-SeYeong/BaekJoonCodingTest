import javafx.geometry.Pos
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.min

class test2178 {
    companion object {
        data class Pos(val x: Int, val y: Int, val count: Int)
        fun test2178() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val st = StringTokenizer(br.readLine())

            val N = Integer.parseInt(st.nextToken())
            val M = Integer.parseInt(st.nextToken())
            val map = Array(N) {CharArray(M) }

            for (i in 0 until N) {
                map[i] = br.readLine().toCharArray()
            }

            val queue = LinkedList<Pos>()
            queue.add(Pos(0, 0, 1))

            var result = N * M

            while(queue.isNotEmpty()) {
//        println("queue = ${queue}")
                val p = queue.pollFirst()

                if (p.x == N-1 && p.y == M-1) {
                    result = min(result, p.count)
                }


                if (p.x+1 < N && map[p.x+1][p.y] == '1') {
                    queue.add(Pos(p.x+1, p.y, p.count+1))
                    map[p.x+1][p.y] = '0'
                }

                if (p.x-1 >= 0 && map[p.x - 1][p.y] == '1') {
                    queue.add(Pos(p.x-1, p.y, p.count+1))
                    map[p.x-1][p.y] = '0'
                }

                if (p.y+1 < M && map[p.x][p.y+1] == '1') {
                    queue.add(Pos(p.x, p.y+1, p.count+1))
                    map[p.x][p.y+1] = '0'
                }

                if (p.y-1 >= 0 && map[p.x][p.y-1] == '1') {
                    queue.add(Pos(p.x, p.y-1, p.count+1))
                    map[p.x][p.y-1] = '0'
                }
            }

            print(result)
        }
    }
}