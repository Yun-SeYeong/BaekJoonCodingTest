import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigDecimal

class test15829 {
    companion object {
        fun test15829() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))

            val count = Integer.parseInt(br.readLine())
            val line = br.readLine().toCharArray()
            var result = BigDecimal.ZERO
            val a = BigDecimal(31)

            for (i in 0 until count) {
                result = result.add(BigDecimal(line[i].code - 96).multiply(a.pow(i)))
            }
            bw.write(result.remainder(BigDecimal(1234567891)).toString())
            bw.flush()
            bw.close()
        }
    }
}