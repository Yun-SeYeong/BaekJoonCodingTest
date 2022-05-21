class test10951 {
    companion object {
        fun test10951() {
            var nums : List<String>
            val result = ArrayList<Int>()

            while(true) {
                val r = readLine()?.let {
                    if (it.isNotBlank()) {
                        nums = it.split(" ")
                        Integer.parseInt(nums[0]) + Integer.parseInt(nums[1])
                    } else {
                        null
                    }
                }
                if (r != null) {
                    result.add(r)
                } else {
                    break
                }
            }

            print(result.joinToString("\n"))
        }
    }
}