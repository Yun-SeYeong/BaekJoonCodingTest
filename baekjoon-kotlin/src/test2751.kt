import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class test2751 {
    companion object {
        fun test2751() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))

            val count = Integer.parseInt(br.readLine())

            val list = LinkedList<Int>()

            for (i in 0 until count) {
                val num = Integer.parseInt(br.readLine())
                list.add(num)
            }
            list.sort()

            list.forEach {
                bw.write("$it\n")
            }
            bw.flush()
        }

        fun test2751v2() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))

            val count = Integer.parseInt(br.readLine())

            val list = BooleanArray(2000001)

            for (i in 0 until count) {
                list[Integer.parseInt(br.readLine()) + 1000000] = true
            }

            list.forEachIndexed { index, value ->
                if (value) {
                    bw.write("${index-1000000}\n")
                }
            }
            bw.flush()
        }
    }
}