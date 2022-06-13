import java.io.BufferedReader
import java.io.InputStreamReader

class test5525 {
    companion object {
        fun test5525() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val N = Integer.parseInt(br.readLine())
            val M = Integer.parseInt(br.readLine())
            val line = br.readLine().toCharArray()

            val check = BooleanArray(M)

            var result = 0

            for (i in 0 until M - 1) {
                if (line[i] == 'I' && !check[i]) {
                    //println(i)
                    var c = 1
                    for (j in i+1 until M-1 step 2) {
                        if (line[j] == 'O' && line[j+1] == 'I') {
                            //println("j = ${j}")
                            //println("c = ${c}")
                            check[j] = true
                            check[j+1] = true
                            if (c++ >= N) {
                                result++
                            }
                        } else {
                            break
                        }
                    }
                }
            }

            //println("check = ${check.contentToString()}")

            print(result)
        }
    }
}