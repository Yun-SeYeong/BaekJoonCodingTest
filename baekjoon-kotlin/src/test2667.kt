import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test2667 {
    companion object {
        data class Pos(var x: Int, var y: Int)
        fun test2667() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val N = Integer.parseInt(br.readLine())

            val array = mutableListOf<CharArray>()

            for (i in 0 until N) {
                array.add(br.readLine().toCharArray())
            }

            var result = 0
            val list = mutableListOf<Int>()

            for (i in 0 until N) {
                for (j in 0 until N) {
                    if (array[i][j] == '1') {
                        val queue = LinkedList<Pos>()
                        queue.add(Pos(i, j))
                        array[i][j] = '2'

                        var count = 1

                        while(queue.isNotEmpty()) {
                            val n = queue.pollFirst()

                            if (n.x+1 < N && array[n.x+1][n.y] == '1') {
                                queue.add(Pos(n.x+1, n.y))
                                array[n.x+1][n.y] = '2'
                                count++
                            }

                            if (n.x-1 >= 0 && array[n.x-1][n.y] == '1') {
                                queue.add(Pos(n.x-1, n.y))
                                array[n.x-1][n.y] = '2'
                                count++
                            }

                            if (n.y+1 < N && array[n.x][n.y+1] == '1') {
                                queue.add(Pos(n.x, n.y+1))
                                array[n.x][n.y+1] = '2'
                                count++
                            }

                            if (n.y-1 >= 0 && array[n.x][n.y-1] == '1') {
                                queue.add(Pos(n.x, n.y-1))
                                array[n.x][n.y-1] = '2'
                                count++
                            }
                        }
                        list.add(count)
                        result++
                    }
                }
            }
            println(result)
            list.sort()
            repeat(result) { println(list[it])}
        }
    }
}