import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.max
import kotlin.math.min

class test1096 {
    companion object {
        fun test2096() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val n = Integer.parseInt(br.readLine())

            val maxMap = Array(n) {IntArray(3)}
            val minMap = Array(n) {IntArray(3) {Int.MAX_VALUE} }

            minMap[0][0] = 0
            minMap[0][1] = 0
            minMap[0][2] = 0

            var maxValue = 0
            var minValue = Int.MAX_VALUE

            for (i in 0 until n) {
                val st = StringTokenizer(br.readLine())
                for (j in 0 until 3) {
                    val v = Integer.parseInt(st.nextToken())
                    maxMap[i][j] += v
                    minMap[i][j] += v

                    if (i >= n-1) {
                        if (maxMap[i][j] > maxValue) {
                            maxValue = maxMap[i][j]
                        }

                        if (minMap[i][j] < minValue) {
                            minValue =  minMap[i][j]
                        }
                    } else {
                        when (j) {
                            0 -> {
                                minMap[i+1][j] = min(minMap[i][j], minMap[i+1][j])
                                minMap[i+1][j+1] = min(minMap[i][j], minMap[i+1][j+1])

                                maxMap[i+1][j] = max(maxMap[i][j], minMap[i+1][j])
                                maxMap[i+1][j+1] = max(maxMap[i][j], minMap[i+1][j+1])
                            }
                            1 -> {
                                minMap[i+1][j-1] = min(minMap[i][j], minMap[i+1][j-1])
                                minMap[i+1][j] = min(minMap[i][j], minMap[i+1][j])
                                minMap[i+1][j+1] = min(minMap[i][j], minMap[i+1][j+1])

                                maxMap[i+1][j-1] = max(maxMap[i][j], maxMap[i+1][j-1])
                                maxMap[i+1][j] = max(maxMap[i][j], maxMap[i+1][j])
                                maxMap[i+1][j+1] = max(maxMap[i][j], maxMap[i+1][j+1])
                            }
                            2 -> {
                                minMap[i+1][j-1] = min(minMap[i][j], minMap[i+1][j-1])
                                minMap[i+1][j] = min(minMap[i][j], minMap[i+1][j])

                                maxMap[i+1][j-1] = max(maxMap[i][j], maxMap[i+1][j-1])
                                maxMap[i+1][j] = max(maxMap[i][j], maxMap[i+1][j])
                            }
                        }
                    }
                }
            }
//    println(maxMap.contentDeepToString())
//    println(minMap.contentDeepToString())

            print("$maxValue $minValue")
        }
    }
}