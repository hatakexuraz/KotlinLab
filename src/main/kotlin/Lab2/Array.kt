package Lab2

var array2 = intArrayOf(10, 20, 30)
var arrarString = Array<String>(3, {""})

fun main(args: Array<String>){

    var array = arrayOf(1, "one", true)
    array[0] = 10
    array[1] = "world"

    println("${array[0]}...${array[1]}...${array[2]}")
    println("size: ${array.size}..${array.get(0)}..${array.get(1)}..${array.get(2)}")


    var list1 = listOf<Int>(10,20)
    println("immutable list data")
    list1.forEach{
        println(it)
    }
//    list1.add(30)     //shows error because it is a list of immutable type which cannot change value once set

    var list2 = mutableListOf<Int>(10, 20)
    println("mutable list data")
    list2.add(30)       //immutable list "changable data" variable
    list2.forEach{
        println(it)
    }


}