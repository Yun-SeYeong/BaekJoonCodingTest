import java.io.BufferedReader
import java.io.InputStreamReader

class test17626 {
    companion object {
        fun test17626() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val n = Integer.parseInt(br.readLine())

            val list = IntArray(n+1)
            val slist = mutableListOf<Int>()

            list[1] = 1
            slist.add(1)


            for (i in 2 until n+1) {
                if (list[i] != 1) {
                    var minValue = 4

                    slist.forEach {
                        if (i > it && list[i - it] + 1 < minValue) {
                            minValue = list[i - it] + 1
                        }
                    }
                    list[i] = minValue

                } else {
                    slist.add(i)
                }
                if (i < 233 && i*i < n+1) {
                    list[i*i] = 1
                }
            }

//    println("list.contentToString() = ${list.contentToString()}")

            print(list[n])
        }
    }
}