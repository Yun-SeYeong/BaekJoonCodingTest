import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class test1003 {
    companion object {
        fun test1003() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))

            val count = Integer.parseInt(br.readLine())

            val zeroArray = IntArray(41)
            val oneArray = IntArray(41)

            zeroArray[0] = 1
            zeroArray[1] = 0

            oneArray[0] = 0
            oneArray[1] = 1

            for (i in 2 until 41) {
                zeroArray[i] = zeroArray[i-1] + zeroArray[i-2]
                oneArray[i] = oneArray[i-1] + oneArray[i-2]
            }

            for (i in 0 until count) {
                val n = Integer.parseInt(br.readLine())
                bw.write("${zeroArray[n]} ${oneArray[n]}\n")
            }
            bw.flush()
            bw.close()
        }
    }
}