package annotation_example
class Looptest {
    var data = intArrayOf(88, 70, 51, 52, 53, 39, 43, 16, 80, 15, 48, 40,
            22, 40, 29, 36, 96, 88, 82, 66, 11, 94, 50, 32, 27, 69,
            57, 17, 30, 33, 95, 10, 18, 45, 83, 96, 74, 35, 49, 51,
            88, 20, 11, 60, 9, 35, 82, 73, 67, 5, 80, 71, 45, 6, 77,
            81, 76, 15, 47, 68, 83, 26, 56, 83, 12, 4, 10, 71, 63, 44,
            75, 89, 47, 52, 47, 41, 31, 57, 66, 65, 66, 75, 44, 76, 76,
            53, 11, 90, 87, 0, 13, 85, 72, 35, 73, 36, 60, 12, 6, 52, 8,
            14, 52, 21, 50, 12, 8, 71, 22, 87, 89, 56, 41, 75, 53, 62, 39,
            7, 57, 62, 55, 46, 63, 62, 24, 49, 75, 75, 20, 34, 70, 89, 6,
            54, 7, 77, 31, 35, 15, 39)
}

    fun main() {
        val loop = Looptest()
        var j = 1
        for (i in loop.data) {
            if (j==15) {
                println()
                j = 1
            }
            else{
                j = j+1
                print("$i, ")
            }
        }

        someMethod()
    }

fun someMethod() {
    val property = null
    property?.let {
        println("$property")
    } ?: run {
        println("property: Null")
    }
}
