import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test1389 {
    companion object {
        fun test1389() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val st = StringTokenizer(br.readLine())

            val N = Integer.parseInt(st.nextToken())
            val M = Integer.parseInt(st.nextToken())

            val users = Array(N+1) { ArrayList<Int>() }
            val map = HashMap<Int, Int>()

            for (i in 0 until M) {
                val st2 = StringTokenizer(br.readLine())

                val n1 = Integer.parseInt(st2.nextToken())
                val n2 = Integer.parseInt(st2.nextToken())

                users[n1].add(n2)
                users[n2].add(n1)
            }


            fun getCount(v1: Int, v2: Int): Int {
                var count = 0
                var isFound = false

                var queue = LinkedList<Int>()
                queue.push(v1)

                while (!isFound) {
                    val tmp = LinkedList<Int>()

                    while(queue.isNotEmpty()) {
                        val n = queue.pop()
                        users[n].forEach {
                            if (it == v2) {
                                isFound = true
                            } else {
                                tmp.addLast(it)
                            }
                        }
                    }

                    queue = tmp
                    count++
                }
                //println("count = ${count}")
                return count
            }


            for (i in 1..N) {
                var score = 0
                for (j in 1..N) {
                    if (i != j) {
                        score += getCount(i, j)
                    }
                }
                map[i] = score
            }

            //println("map.toString() = ${map.toString()}")

            print(map.entries.sortedWith(compareBy({it.value}, {it.key}))[0].key)
        }
    }
}