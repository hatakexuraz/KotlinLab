package annotation_example

//import kotlin.reflect.full.*


@ImAPlant class Plant{
    fun trim(){

    }
    fun fertilizer(){}
}

fun testAnnotation(){
    val classObj = Plant::class
//    for (m in classObj.declaredMemberFunctions){        //prints the function name of the class Plant
//        println(m.name)
//    }
    for (a in classObj.annotations) {       //prints the annotation of the class
        println(a.annotationClass.simpleName)
    }
}

fun main() {
    testAnnotation()
}

annotation class ImAPlant