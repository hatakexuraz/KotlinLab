package Lab2

fun add(a: Int=5, b: Int): Int{
    return a+b
}

//same as the function above in single line
fun add2(a: Int, b: Int) = a+b

//Function overloading also available same as that of JAVA

//Providing a default value to the parameter and only provide value to second parameter
 fun main(argsL: Array<String>){
    println("Sum: ${add(6,2)}")
    print("Sum: ${add(b=2)}")
}