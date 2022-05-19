import java.io.BufferedReader
import java.io.InputStreamReader

class test2920 {
    companion object {
        fun test2920() {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val line = br.readLine();

            if (line == "1 2 3 4 5 6 7 8") {
                print("ascending")
            } else if (line == "8 7 6 5 4 3 2 1") {
                print("descending")
            } else {
                print("mixed")
            }
        }
    }

}