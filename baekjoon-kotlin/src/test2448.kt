import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

// 0 0 0 0 0 1 0 0 0 0 0
// 0 0 0 0 1 0 1 0 0 0 0
// 0 0 0 1 1 1 1 1 0 0 0
// 0 0 1 0 0 0 0 0 1 0 0
// 0 1 0 1 0 0 0 1 0 1 0
// 1 1 1 1 1 0 1 1 1 1 1

// (width-N)/2 ~ (width-N)/2 + N,
// 0 ~ N 0 0 ~ N

class test2448 {
    companion object {
        fun test2448() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))

            val N = Integer.parseInt(br.readLine())

            fun circle(array: Array<CharArray>) {
                val arrayWidth = array[0].size
                val arrayHeight = array.size

                if (arrayHeight >= N) {
                    array.forEach {
                        bw.write("${String(it)}\n")
                    }
                    return
                }

                val width = arrayWidth*2 + 1
                val height = array.size*2
                val result = Array(height) {
                    CharArray (width) { ' ' }
                }

                for (i in 0 until arrayHeight) {
                    var x = 0
                    for (j in ((width-arrayWidth)/2) until ((width-arrayWidth)/2 + arrayWidth)) {
                        result[i][j] =
                            array[i][x]
                        x++
                    }
                }

                for (i in arrayHeight until arrayHeight*2) {
                    var x = 0
                    for (j in 0 until arrayWidth) {
                        result[i][j] =
                            array[i - arrayHeight][x]
                        x++
                    }
                    x = 0
                    for (j in arrayWidth+1 until arrayWidth*2+1) {
                        result[i][j] =
                            array[i - arrayHeight][x]
                        x++
                    }
                }
                circle(result)
            }

            val c = arrayOf(
                charArrayOf(' ', ' ', '*', ' ', ' '),
                charArrayOf(' ', '*', ' ', '*', ' '),
                charArrayOf('*', '*', '*', '*', '*'),
            )

            circle(c)

            bw.flush()
            bw.close()
        }
    }
}