package Lab2

//while inheriting abstract class, the sub class should implement all the members of the super class

abstract class Super{
    abstract val data : Int
    abstract fun myFun()
    abstract fun myFun2()
}


class Sub() : Super(){
    override val data: Int = 10
    override fun myFun() {
        TODO("Not yet implemented")
    }

    override fun myFun2() {
        TODO("Not yet implemented")
    }
}