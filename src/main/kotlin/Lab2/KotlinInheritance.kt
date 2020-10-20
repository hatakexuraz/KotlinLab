package Lab2

open class Shape(){
    open fun shape(height: Int, width:Int){
        println("Height: $height, Width: $width")
    }
}

class Rect : Shape(){
    override fun shape(height: Int, width: Int) {
        super.shape(height,width)
    }
}

fun main(args:Array<String>){
    var rect = Rect()
    rect.shape(110, 20)
}