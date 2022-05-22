import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test1978 {
    companion object {
        fun test1978() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            br.readLine()
            val st = StringTokenizer(br.readLine())

            val array = BooleanArray(1000) {true}
            array[0] = false

            var count = 0
            for (i in 2..1000) {
                if (array[i - 1]) {
                    var j = 2
                    while (i * j <= 1000) {
                        array[i*j-1] = false
                        j++
                    }
                }
            }

            while(st.hasMoreTokens()) {
                if(array[Integer.parseInt(st.nextToken())-1]) {
                    count++
                }
            }
            print(count)
        }
    }
}