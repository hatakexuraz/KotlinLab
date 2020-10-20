package Lab2


//Switch test like JAVA but is 'when' in Kotlin
//below are the different ways a 'when' expression can be used
fun testWhenlikeSwitch(any: Any){
    when(any){
        1 -> println("any is 1")
        10, 20 -> println("any is 10 or 20")
        30 -> {
            var result = any as Int * 2
            println("any is 30, result is $result")
        }
        "hello" -> println("any is hello")
        is Int -> println("any is int but not 1, 10, 20, 30")
        is String -> println("any is String but not hello")
        else -> println("unknown data")
    }
}


fun main(argsL: Array<String>){
    testWhenlikeSwitch("")
}