import java.io.BufferedReader
import java.io.InputStreamReader

class test10809 {
    companion object {
        fun test10809() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val line = br.readLine().toCharArray()
            val array = IntArray(26) { -1 }

            for (i in line.indices) {
                if (array[line[i] - 'a'] < 0) {
                    array[line[i] - 'a'] = i
                }
            }

            print(array.joinToString(" "))
        }
    }
}