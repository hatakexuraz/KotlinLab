package Lab2

fun main(argsL: Array<String>) {
    for (i in 10 downTo 1 step 2) {
        println(i)
    }

    val list = listOf<String>("Hello", "World", "!!")
    for (i in list) {
        println(i)
    }

    for (i in list.indices) {
        println(list[i])
    }

    for ((index, value) in list.withIndex()) {
        println("Index: $index, value: $value")
    }

    //while loop
    var x = 0
    var sum = 0
    while(x<10){
        sum += ++x
        println("while "+sum)
    }


    for(i in 1..3){
        brk@ for (j in 1..3){           //breaks the loop from the annotated point i.e inner loop and start outer loop
            if (j > 2) break@brk
            println("i: $i   j:$j")
        }
    }
}