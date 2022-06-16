import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test7569 {
    companion object {
        data class Pos(val v: Int, val x: Int, val y: Int, val h: Int)
        fun test7569() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val st = StringTokenizer(br.readLine())
            val M = Integer.parseInt(st.nextToken())
            val N = Integer.parseInt(st.nextToken())
            val H = Integer.parseInt(st.nextToken())

            val box = mutableListOf<IntArray>()

            val queue = LinkedList<Pos>()
            var count = 0

            for (i in 0 until N*H) {
                val st2 = StringTokenizer(br.readLine())
                val array = IntArray(M)
                for (j in 0 until M) {
                    array[j] = Integer.parseInt(st2.nextToken())
                    if (array[j] == 1) {
                        queue.add(Pos(0,i%N, j, i/N))
                    } else if (array[j] == 0) {
                        count++
                    }
                }
                box.add(array)
            }

//    println("queue = ${queue}")
//    println("box = ${box}")

            var result = 0

            var resultCount = 0

            while(queue.isNotEmpty()) {
//        println("==================")
//        box.forEach {
//            println(it.contentToString())
//        }
                val p = queue.pollFirst()

                if (p.v > result) {
                    result = p.v
                }

                if (p.x + 1 < N && box[p.h*N+(p.x + 1)][p.y] == 0) {
                    queue.add(Pos(p.v+1, (p.x + 1), p.y, p.h))
                    box[p.h*N+(p.x + 1)][p.y] = 1
                    resultCount++
                }

                if (p.x - 1 >= 0 && box[p.h*N+(p.x-1)][p.y] == 0) {
                    queue.add(Pos(p.v+1, p.x - 1, p.y, p.h))
                    box[p.h*N+(p.x-1)][p.y] = 1
                    resultCount++
                }

                if (p.y + 1 < M && box[p.h*N+p.x][p.y+1] == 0) {
                    queue.add(Pos(p.v+1, p.x, p.y + 1, p.h))
                    box[p.h*N+p.x][p.y+1] = 1
                    resultCount++
                }

                if (p.y - 1 >= 0 && box[p.h*N+p.x][p.y-1] == 0) {
                    queue.add(Pos(p.v+1, p.x, p.y - 1, p.h))
                    box[p.h*N+p.x][p.y-1] = 1
                    resultCount++
                }

                if (p.h + 1 < H && box[(p.h + 1)*N+p.x][p.y] == 0) {
                    queue.add(Pos(p.v+1, p.x, p.y, p.h + 1))
                    box[(p.h + 1)*N+p.x][p.y] = 1
                    resultCount++
                }

                if (p.h - 1 >= 0 && box[(p.h - 1)*N+p.x][p.y] == 0) {
                    queue.add(Pos(p.v+1, p.x, p.y, p.h - 1))
                    box[(p.h - 1)*N+p.x][p.y] = 1
                    resultCount++
                }
            }

//    println("resultCount = ${resultCount}")
//    println("count = ${count}")



            if (count == resultCount) {
                println(result)
            } else {
                println("-1")
            }
        }
    }
}