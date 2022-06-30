import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.min

class test1149 {
    companion object {
        fun test1149() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val N = Integer.parseInt(br.readLine())

            val houseList = Array(N) { IntArray(3) }

            repeat(N) {
                val st = StringTokenizer(br.readLine())

                if (it > 0) {
                    for (j in 0 until 3) {
                        houseList[it][j] = Integer.parseInt(st.nextToken()) + min(houseList[it-1][(j+1)%3], houseList[it-1][(j+2)%3])
                    }
                } else {
                    for (i in 0 until 3){
                        houseList[it][i] = Integer.parseInt(st.nextToken())
                    }
                }
            }

            print(houseList[N-1].minOrNull())
        }
    }
}