package Lab2

import javax.swing.ImageIcon

//LAMBDA FUNCTION CREATION
var dirtyLevel = 20
val waterFilter: (Int) -> Int = {dirty -> dirty/2}
    //OR
val waterFilter2 = { dirty : Int -> dirty/2}

//passing a lambda as argument creates one
//HIGHER ORDER FUNCTION
fun updateDirty(dirty:Int, operation : (Int) -> Int): Int{
    return operation(dirty)
}


fun main(){
    //Lambda call
    println("${waterFilter(dirtyLevel)}")

    //Higher order function call
    println(updateDirty(30, waterFilter2))

    //ANOTHER OTHER WAY TO CREATE HIGHER ORDER FUNCTION
    //Kotlin prefers that any parameter that takes a function is the last parameter, YOU DONT HAVE TO
    //PASS THE LAMBDA AS OPERATION, YOU CAN RATHER pass a lambda for the function parameter SAME AS LINE
    //29
    var dirtyLevel = 19;
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
    println(dirtyLevel)
}