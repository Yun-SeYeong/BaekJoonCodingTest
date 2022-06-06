import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class test1260 {
    companion object {
        fun test1260() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))
            val st = StringTokenizer(br.readLine())

            val N = Integer.parseInt(st.nextToken())
            val M = Integer.parseInt(st.nextToken())
            val V = Integer.parseInt(st.nextToken())

            val map = Array(N+1) { ArrayList<Int>() }

            for (i in 0 until M) {
                val st2 = StringTokenizer(br.readLine())
                val x = Integer.parseInt(st2.nextToken())
                val y = Integer.parseInt(st2.nextToken())
                map[x].add(y)
                map[y].add(x)
            }

            //println(map.contentDeepToString())

            val stack = Stack<Int>()
            val visit = BooleanArray(N+1)
            stack.push(V)

            while (stack.isNotEmpty()) {
                //println("stack = ${stack}")
                //println("visit = ${visit.contentToString()}")
                val s = stack.pop()

                if (!visit[s]) {
                    //println("s = ${s}")
                    bw.write("$s ")
                    val sm = map[s].sortedBy { -it }

                    for (l in sm) {
                        stack.push(l)
                    }

                    visit[s] = true
                }
            }
            bw.write("\n")

            val queue = LinkedList<Int>()
            val visit2 = BooleanArray(N+1)
            queue.push(V)

            while (queue.isNotEmpty()) {
                //println("stack = ${queue}")
                ////println("visit = ${visit2.contentToString()}")
                val s = queue.pop()

                if (!visit2[s]) {
                    //println("s = ${s}")
                    bw.write("$s ")
                    val sm = map[s].sortedBy { it }

                    for (l in sm) {
                        queue.addLast(l)
                    }

                    visit2[s] = true
                }
            }
            bw.flush()
            bw.close()
        }
    }
}