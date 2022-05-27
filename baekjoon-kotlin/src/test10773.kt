import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test10773 {
    companion object {
        fun test10773() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val count = Integer.parseInt(br.readLine())

            val stack = Stack<Int>()

            for (i in 0 until count) {
                val n = Integer.parseInt(br.readLine())

                if (n != 0) {
                    stack.push(n)
                } else {
                    stack.pop()
                }
            }
            print(stack.sum())
        }
    }
}