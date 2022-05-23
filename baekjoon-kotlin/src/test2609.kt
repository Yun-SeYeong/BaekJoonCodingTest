import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

class test2609 {
    companion object {
        fun test2609() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val line = br.readLine().split(" ")
            val A = Integer.parseInt(line[0])
            val B = Integer.parseInt(line[1])

            var lcm = 1

            for (i in min(A,B) downTo 1) {
                if (A % i == 0 && B % i == 0) {
                    lcm = i
                    break
                }
            }

            var gcd = 0

            while (true) {
                gcd += lcm

                if (gcd % A == 0 && gcd % B == 0) {
                    break
                }
            }
            println(lcm)
            println(gcd)
        }
    }
}