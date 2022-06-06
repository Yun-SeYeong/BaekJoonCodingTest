import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class test1697 {
    companion object {
        fun test1697() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))
            val st = StringTokenizer(br.readLine())

            val N = Integer.parseInt(st.nextToken())
            val K = Integer.parseInt(st.nextToken())

            val map = BooleanArray(100001)

            map[N] = true

            val queue = LinkedList<Pair<Int, Int>>()
            queue.add(Pair(0, N))

            while(queue.isNotEmpty()) {
//        println("queue.toString() = ${queue.toString()}")
                val n = queue.pop()

                if (n.second == K) {
                    bw.write("${n.first}")
                    break
                }

                map[n.second] = true

                if (n.second < K && !map[n.second+1]) {
                    queue.add(Pair(n.first+1, n.second+1))
                }

                if (n.second-1 >= 0 && !map[n.second-1]) {
                    queue.add(Pair(n.first+1, n.second - 1))
                }

                if (n.second*2 <= 100000 && n.second < K && !map[n.second*2]) {
                    queue.add(Pair(n.first+1, n.second * 2))
                }
            }
            bw.flush()
            bw.close()
        }
    }
}