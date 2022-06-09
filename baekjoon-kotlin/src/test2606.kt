import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test2606 {
    companion object {
        fun test2606() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            var N1 = Integer.parseInt(br.readLine())
            var N2 = Integer.parseInt(br.readLine())

            val list = Array<MutableList<Int>>(N1+1) { mutableListOf() }

            for (i in 0 until N2) {
                val st = StringTokenizer(br.readLine())
                val n1 = Integer.parseInt(st.nextToken())
                val n2 = Integer.parseInt(st.nextToken())
                list[n1].add(n2)
                list[n2].add(n1)
            }

            val visit = mutableListOf<Int>()
            visit.add(1)

            val queue = LinkedList<Int>()
            queue.add(1)

            var count = 0

            while(queue.isNotEmpty()) {
                val n = queue.pollLast()
                count++

                list[n].forEach {
                    if (it !in visit) {
                        queue.add(it)
                        visit.add(it)
                    }
                }
            }

            print(count-1)
        }
    }
}