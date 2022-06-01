import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class test1012 {
    companion object {
        fun test1012() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))

            val count = Integer.parseInt(br.readLine())

            for (i in 0 until count) {
                val st1 = StringTokenizer(br.readLine())

                val M = Integer.parseInt(st1.nextToken())
                val N = Integer.parseInt(st1.nextToken())
                val K = Integer.parseInt(st1.nextToken())

                val map = HashMap<Pair<Int, Int>, Int>()

                for (j in 0 until K) {
                    val st2 = StringTokenizer(br.readLine())
                    val m = Integer.parseInt(st2.nextToken())
                    val n = Integer.parseInt(st2.nextToken())
                    map[Pair(n, m)] = 1
                }

//        println(map.contentDeepToString())

                val queue = LinkedList<Pair<Int, Int>>()
                var c = 1

                map.forEach {
                    if (it.value == 1) {
                        queue.addLast(it.key)
                        c++

                        while (queue.isNotEmpty()) {
                            val p = queue.first()
                            queue.removeFirst()
                            map[p] = c

                            if (map[Pair(p.first - 1, p.second)] == 1) {
                                queue.addFirst(Pair(p.first - 1, p.second))
                            }

                            if (map[Pair(p.first, p.second - 1)] == 1) {
                                queue.addFirst(Pair(p.first, p.second - 1))
                            }

                            if (map[Pair(p.first + 1, p.second)] == 1) {
                                queue.addFirst(Pair(p.first + 1, p.second))
                            }

                            if (map[Pair(p.first, p.second + 1)] == 1) {
                                queue.addFirst(Pair(p.first, p.second + 1))
                            }
                        }

//                    println(map.contentDeepToString())
                    }
                }
                bw.write("${c - 1}\n")
            }
            bw.flush()
            bw.close()
        }
    }
}