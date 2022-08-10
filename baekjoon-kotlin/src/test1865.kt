import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class test1865 {
    companion object {
        data class Line(val s: Int, val n: Int, val d: Int)
        fun test1865() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val bw = BufferedWriter(OutputStreamWriter(System.out))

            val TC = Integer.parseInt(br.readLine())

            for (i in 0 until TC) {

                val st = StringTokenizer(br.readLine())
                val N = Integer.parseInt(st.nextToken())
                val M = Integer.parseInt(st.nextToken())
                val W = Integer.parseInt(st.nextToken())

                val map = mutableSetOf<Line>()

                for (j in 0 until M) {
                    val st2 = StringTokenizer(br.readLine())
                    val S = Integer.parseInt(st2.nextToken())
                    val E = Integer.parseInt(st2.nextToken())
                    val T = Integer.parseInt(st2.nextToken())
                    map.add(Line(S, E, T))
                    map.add(Line(E, S, T))
                }

                for (j in 0 until W) {
                    val st2 = StringTokenizer(br.readLine())
                    val S = Integer.parseInt(st2.nextToken())
                    val E = Integer.parseInt(st2.nextToken())
                    val T = Integer.parseInt(st2.nextToken())
                    map.add(Line(S, E, -T))
                }

                fun bellmanford(): Boolean {
                    val result = IntArray(N+1) {0}

                    repeat(N) { count ->
                        map.forEach {
                            var v = result[it.s]
                            if (v != Int.MAX_VALUE) {
                                v += it.d
                            }
                            if (result[it.n] > v) {
                                result[it.n] = v

                                if (count == N-1) {
                                    return true
                                }
                            }
                        }
                    }
                    return false
                }
                if (bellmanford()) {
                    bw.write("YES\n")
                } else {
                    bw.write("NO\n")
                }
            }
            bw.flush()
            bw.close()
        }
    }
}