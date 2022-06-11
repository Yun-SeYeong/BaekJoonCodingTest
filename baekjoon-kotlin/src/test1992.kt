import java.io.BufferedReader
import java.io.InputStreamReader

class test1992 {
    companion object {
        fun test1992() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val N = Integer.parseInt(br.readLine())

            val map = mutableListOf<MutableList<Int>>()

            for (i in 0 until N) {
                val line = mutableListOf<Int>()
                br.readLine().toCharArray().forEach {
                    line.add(it.digitToInt())
                }
                map.add(line)
            }

//    println("map = ${map}")

            fun dfs(size: Int, x: Int, y: Int): String {

                val firstVal = map[x][y]
                var check = true

                for (i in x until x + size) {
                    for (j in y until y + size) {
                        if (map[i][j] != firstVal) {
                            check = false
                            break
                        }
                    }
                    if (!check) {
                        break
                    }
                }

                return if (check) {
                    firstVal.toString()
                } else {
                    "(${dfs(size/2, x, y)}${dfs(size/2, x, y+size/2)}${dfs(size/2, x+size/2, y)}${dfs(size/2, x+size/2, y+size/2)})"
                }
            }

            print(dfs(N, 0, 0))
        }
    }
}