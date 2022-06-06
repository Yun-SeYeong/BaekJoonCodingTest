import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test1463 {
    companion object {
        fun test1463() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val X = Integer.parseInt(br.readLine())

            val queue = LinkedList<Pair<Int, Int>>()
            val check = BooleanArray(X+1)
            queue.add(Pair(0, X))
            var result = 1

            while(queue.isNotEmpty()) {
//        println("queue = ${queue}")
                val n = queue.poll()

                if (n.second != 1) {
                    if (n.second%3 == 0 && !check[n.second/3]) {
                        queue.add(Pair(n.first+1, n.second/3))
                        check[n.second/3] = true
                    }

                    if (n.second%2 == 0 && !check[n.second/2]) {
                        queue.add(Pair(n.first+1, n.second/2))
                        check[n.second/2] = true
                    }

                    if (!check[n.second-1]) {
                        queue.add(Pair(n.first+1, n.second-1))
                        check[n.second-1] = true
                    }
                } else {
                    result = n.first
                    break
                }
            }
            print(result)
        }
    }
}