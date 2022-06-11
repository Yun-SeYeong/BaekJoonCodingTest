import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class test18870 {
    companion object {
        data class Num(var index: Int, var value: Int)

        fun test18870() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))

            val N = Integer.parseInt(br.readLine())

            val st = StringTokenizer(br.readLine())

            val array = mutableListOf<Num>()
            val result = IntArray(N)

            for (i in 0 until N) {
                array.add(Num(i, Integer.parseInt(st.nextToken())))
            }

            array.sortBy { it.value }

            var last = 0
            var lastVal = array[0].value
            result[array[0].index] = last

            for (i in 1 until N) {
                if (lastVal < array[i].value) {
                    lastVal = array[i].value
                    last++
                }
                result[array[i].index] = last
            }

            repeat(N) {
                bw.write("${result[it]} ")
            }
            bw.flush()
            bw.close()
        }
    }
}