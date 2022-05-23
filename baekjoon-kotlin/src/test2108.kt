import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.round

class test2108 {
    companion object {
        fun test2108() {
            val br = BufferedReader(InputStreamReader(System.`in`))

            val count = Integer.parseInt(br.readLine())

            val nums = IntArray(count)

            var total = 0
            val countMap = HashMap<Int, Int>()


            for (i in 0 until count) {
                val num = Integer.parseInt(br.readLine())

                nums[i] = num
                total += num
                countMap[num] = countMap.getOrDefault(num, 0) + 1
            }
            nums.sort()

            println(round((total.toDouble()/count)).toInt())
            println(nums[nums.size/2])



            val sortedMap = countMap.entries.sortedWith(compareBy({-it.value}, {it.key}))

            if (sortedMap.size > 1 && sortedMap[0].value == sortedMap[1].value) {
                println(sortedMap[1].key)
            } else {
                println(sortedMap[0].key)
            }


            println(nums[nums.size-1]-nums[0])
        }
    }
}