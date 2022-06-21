import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test11430 {
    companion object {
        fun test11430() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val N = Integer.parseInt(br.readLine())
            val map = HashMap<Int, MutableList<Int>>()

            for (i in 0 until N) {
                val st = StringTokenizer(br.readLine())
                for (j in 0 until N) {
                    if (st.nextToken().equals("1")) {
                        map[i] = map.getOrDefault(i, mutableListOf()).also { it.add(j) }
                    }
                }
            }

            for (i in 0 until N) {
                val list = BooleanArray(N)

                fun dfs(n: Int) {
                    map.getOrDefault(n, mutableListOf()).forEach {
                        if (!list[it]) {
                            list[it] = true
                            dfs(it)
                        }
                    }
                }
                dfs(i)
                repeat(N) {if (list[it]) print("1 ") else print("0 ")}
                println()
            }
        }
    }
}