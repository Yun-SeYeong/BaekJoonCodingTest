import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test1780 {
    companion object {
        data class Paper(var size: Int, var x: Int, var y: Int)

        fun test1780() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val count = Integer.parseInt(br.readLine())

            val map = Array(count) { Array(count) { 0 } }

            for (i in 0 until count) {
                val st = StringTokenizer(br.readLine())
                for (j in 0 until count) {
                    map[i][j] = Integer.parseInt(st.nextToken())
                }
            }

            var c1 = 0
            var c2 = 0
            var c3 = 0

            val queue = LinkedList<Paper>()
            queue.add(Paper(count, 0, 0))

            while(queue.isNotEmpty()) {
                //println("queue = ${queue}")
                val p = queue.pop()

                val n = map[p.x][p.y]
                var isSame = true

                for (i in p.x until p.x + p.size) {
                    for (j in p.y until p.y + p.size) {
                        if (map[i][j] != n) {
                            isSame = false
                            break
                        }
                    }
                    if (!isSame) {
                        break
                    }
                }

                if (isSame) {
                    if (n == -1) {
                        c1++
                    } else if (n == 0) {
                        c2++
                    } else {
                        c3++
                    }
                } else if (p.size > 3){
                    for (i in p.x until p.x + p.size step p.size/3) {
                        for (j in p.y until p.y+p.size step p.size/3) {
                            queue.add(Paper(p.size/3, i, j))
                        }
                    }
                } else if (p.size == 3) {
                    for (i in p.x until p.x + p.size) {
                        for (j in p.y until p.y+p.size) {
                            if (map[i][j] == -1) {
                                c1++
                            } else if (map[i][j] == 0) {
                                c2++
                            } else {
                                c3++
                            }
                        }
                    }
                }
            }

            print("$c1\n$c2\n$c3")
        }
    }
}
