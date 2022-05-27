import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class test4949 {
    companion object {
        fun test4949() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))

            while (true) {
                val line = br.readLine()

                if (line == "."){
                    break
                }

                val stack = Stack<Int>()
                var result = "yes"

                for (c in line.toCharArray()) {
                    if (c == '(') {
                        stack.push(1)
                    } else if (c == ')') {
                        if (stack.empty() || 1 != stack.pop()) {
                            result = "no"
                            break
                        }
                    }

                    if (c == '[') {
                        stack.push(2)
                    } else if (c == ']') {
                        if (stack.empty() || 2 != stack.pop()) {
                            result = "no"
                            break
                        }
                    }
                }
                if (!stack.empty()) {
                    result = "no"
                }
                bw.write("$result\n")
            }
            bw.flush()
            bw.close()
        }
    }
}