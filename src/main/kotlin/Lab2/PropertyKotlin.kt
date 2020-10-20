package Lab2

var name: String = "hello"                  //Properties are the variable with their own getter and setter
    get() = field
    set(value) { field = value}

val no:Int = 10
    get() = field

var age: Int = -3
    set(value) {
        if (value<0){
            field = 0
        }
        else{
            field = value
        }
    }

val name2: String? = null
    get() = field?.toUpperCase()


fun main(args:Array<String>){
    println("Name: $name2")
    println("Age: $age")
}