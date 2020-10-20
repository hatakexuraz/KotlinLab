package Lab2

class Test1{
    private var data : Int = 10
    fun some(): Int{
        return  data
    }

    var data2 : Int = 10
        private set(value) {field = value}
}

fun main (array: Array<String>){
    val obj = Test1()

    //obj.data  //cannot be accessed due to private
    obj.some()

    println(obj.data2)
    //obj.data2 = 20    //cannot be accessed because the set accessor is private therefore cannot set value

    val school = arrayOf("shark", "salmon", "minnow")
    println(school)


    //to debus the app, run-> edit configuration ->program argument
    println("${array[0]} ${array[1]}")


    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    println( decorations.filter {it[1] == 'l'})     //returns the value having 'l' as second letter

    aaa@ for(i in 0..5){
        if (i == 3) {
            continue@aaa
        }
        println(i)
    }
}