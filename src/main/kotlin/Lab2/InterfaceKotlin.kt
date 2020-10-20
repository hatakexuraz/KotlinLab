package Lab2

//Interface works same as java in kotlin
//we don't necessarily have to implement all the members of the interface

interface MyInterface{
    var data : String
    fun myFun()
    fun myFun2(){
        print("Some text")
    }
}


class Some() :MyInterface{
    override lateinit var data: String

    override fun myFun() {
    }

    override fun myFun2() {
        super.myFun2()
    }
}
fun main (args:Array<String>){
    val some = Some()
    some.myFun2()
}