import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class test1043 {
    companion object {
        fun test1043() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val st = StringTokenizer(br.readLine())
            val M = Integer.parseInt(st.nextToken())
            val N = Integer.parseInt(st.nextToken())

            val st2 = StringTokenizer(br.readLine())

            val queue = LinkedList<Int>()
            val visitParty = mutableListOf<Int>()
            val visit = BooleanArray(N+1)

            for (i in 0 until Integer.parseInt(st2.nextToken())) {
                val n = Integer.parseInt(st2.nextToken())
                visitParty.add(n)
            }

            val party = Array<MutableList<Int>>(M+1) { mutableListOf() }
            val party2 = Array<MutableList<Int>>(N) { mutableListOf() }
            for (i in 0 until N) {
                val st3 = StringTokenizer(br.readLine())
                for (j in 0 until Integer.parseInt(st3.nextToken())) {
                    val n = Integer.parseInt(st3.nextToken())
                    party[n].add(i)
                    party2[i].add(n)
                }
            }

            visitParty.forEach { v ->
                if (v <= M) {
                    party[v].forEach {
                        queue.add(it)
                    }
                }

            }


//    println("party = ${party.contentDeepToString()}")
//    println("party2 = ${party2.contentDeepToString()}")

            var count = N

            while(queue.isNotEmpty()) {
                val n = queue.pop()
                if (!visit[n]) {
                    count--
                    visit[n] = true
                    party2[n].forEach {
                        party[it].forEach { v ->
                            queue.add(v)
                        }
                    }
                }
            }

            print(count)
        }
    }
}