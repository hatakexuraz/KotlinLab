package Lab2

class User(var id: String, var name:String){
    init {              //initilize the object and calls this init
        println("constructor :  id = $id, name = $name")
    }

    fun some(){
        println("function some :  id = $id, name = $name") //cannot access primary constructor variable without
    }                                                       //mentioning var or val keyword into constructor
}

class User2(name: String){
    constructor(name:String, id: Int): this(name){}
}

fun main(array: Array<String>){
    var user = User("one", "two")
    user.some()
}