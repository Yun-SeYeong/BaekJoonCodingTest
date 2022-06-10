import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test11724 {
    companion object {
        fun test11724() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val st = StringTokenizer(br.readLine())

            val N = Integer.parseInt(st.nextToken())
            val M = Integer.parseInt(st.nextToken())

            val map = Array(N+1) {Array(N+1) {false} }

            for (i in 0 until M) {
                val st2 = StringTokenizer(br.readLine())
                val n = Integer.parseInt(st2.nextToken())
                val n2 = Integer.parseInt(st2.nextToken())
                map[n][n2] = true
                map[n2][n] = true
            }

            val visit = BooleanArray(N+1)

            val queue = LinkedList<Int>()

            var count = 0

            for (i in 1..N) {
                queue.add(i)
                var check = false
                while(queue.isNotEmpty()) {
                    val n = queue.pollFirst()

                    if (!visit[n]) {
                        visit[n] = true
                        check = true
                        for (j in 1..N) {
                            if (map[n][j]) {
                                queue.add(j)
                            }
                        }
                    }
                }

                if (check) {
                    count++
                }
            }
            print(count)
        }
    }
}