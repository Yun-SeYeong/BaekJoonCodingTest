import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test2206 {
    data class Pos(val y: Int, val x:Int, val count: Int, val isCracked: Int)
    fun test2206() {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val st = StringTokenizer(br.readLine())

        val N = Integer.parseInt(st.nextToken())
        val M = Integer.parseInt(st.nextToken())
        val map = mutableListOf<CharArray>()

        for (i in 0 until N) {
            map.add(br.readLine().toCharArray())
        }

        val visit = Array(N) {IntArray(M)}
        val queue = LinkedList<Pos>()
        queue.add(Pos(0, 0,1, 2))
        visit[0][0] = 2

        var minPath = N*M + 1

        while (queue.isNotEmpty()) {
//        println("queue = ${queue}")
//        visit.forEach {
//            println(it.contentToString())
//        }
            val n = queue.pollFirst()

            if (n.x == M-1 && n.y == N-1 && n.count < minPath) {
                minPath = n.count
            }

            if (n.x > 0 && visit[n.y][n.x - 1] < n.isCracked) {
                if (map[n.y][n.x - 1] == '0') {
                    queue.add(Pos(n.y,n.x - 1, n.count+1, n.isCracked))
                    visit[n.y][n.x - 1] = n.isCracked
                } else if (n.isCracked > 1){
                    queue.add(Pos(n.y,n.x - 1, n.count+1,n.isCracked - 1))
                    visit[n.y][n.x - 1] = n.isCracked
                }
            }

            if (n.x < M - 1 && visit[n.y][n.x + 1] < n.isCracked) {
                if (map[n.y][n.x + 1] == '0') {
                    queue.add(Pos(n.y,n.x + 1,n.count+1,  n.isCracked))
                    visit[n.y][n.x + 1] = n.isCracked
                } else if (n.isCracked > 1){
                    queue.add(Pos(n.y,n.x + 1, n.count+1,n.isCracked - 1))
                    visit[n.y][n.x + 1] = n.isCracked
                }
            }

            if (n.y > 0 && visit[n.y - 1][n.x] < n.isCracked) {
                if (map[n.y - 1][n.x] == '0') {
                    queue.add(Pos(n.y - 1,n.x,n.count+1,  n.isCracked))
                    visit[n.y - 1][n.x] = n.isCracked
                } else if (n.isCracked > 1){
                    queue.add(Pos(n.y - 1,n.x,n.count+1, n.isCracked - 1))
                    visit[n.y - 1][n.x] = n.isCracked
                }
            }

            if (n.y < N - 1 && visit[n.y + 1][n.x] < n.isCracked) {
                if (map[n.y + 1][n.x] == '0') {
                    queue.add(Pos(n.y + 1,n.x, n.count+1, n.isCracked))
                    visit[n.y + 1][n.x] = n.isCracked
                } else if (n.isCracked > 1){
                    queue.add(Pos(n.y + 1,n.x, n.count+1,n.isCracked - 1))
                    visit[n.y + 1][n.x] = n.isCracked
                }
            }
        }
        if (minPath == N*M + 1) {
            print(-1)
        } else {
            print(minPath)
        }
    }
}