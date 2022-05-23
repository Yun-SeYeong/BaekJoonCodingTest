import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test2164 {
    companion object {
        fun test2164() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val N = Integer.parseInt(br.readLine())

            val list = LinkedList<Int>()
            for (i in 1..N) {
                list.add(i)
            }

            var check = false

            while (list.size > 1) {
                if (check) {
                    list.addLast(list.first)
                }
                list.removeFirst()
                check = !check
            }

            print(list[0])
        }
    }
}