package generic

open class WaterSupply(var needsProcessing: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}


class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }
}

fun genericExample(){
//    val aquarium = Aquarium<TapWater>(TapWater())     //can initialize as line 21 or 22
    val aquarium = Aquarium(TapWater())
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()  //the watersupply variable in this line is the parameter that is referencing through TapWater()
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}\n")

    //making a generic type more specific by passing string
//    val aquarium2 = Aquarium("string")
//    println(aquarium2.waterSupply+"\n")

    //We can also pass null type because by default, T stands for the nullable Any? type
//    val aquarium3 = Aquarium(null)
//    if (aquarium3.waterSupply == null) {
//        println("waterSupply is null\n")
//    }

    ///checks if the water needs processing and throws exception as error
    val aquarium4 = Aquarium(LakeWater())
    aquarium4.waterSupply.filter();
    aquarium4.addWater()

    //out type example
    val aquarium5 = Aquarium(TapWater())
    //in and out type only effect the function
    addItems(aquarium5)     //a function would not be able to pass the variable if not for the out type.
}

//in and out are about the TYPES of variables.
// in and out make sure that when working with generic types,
// only safe types are passed in and out of functions.
fun addItems(aquarium: Aquarium<WaterSupply>) = println("Item added")


//Doing this create a class with a nullable Any? type
//class Aquarium<T>(val waterSupply: T){
//
//}

//to make sure that only a WaterSupply (or one of its subclasses) can be passed for T.
//Replace Any with WaterSupply to define a more specific generic constraint
class Aquarium<out T: WaterSupply>(val waterSupply: T){
    fun addWater() {
        // check() function helps ensure your code is behaving as expected.
        check(!waterSupply.needsProcessing) { "water supply needs processing first" }
        println("adding water from $waterSupply")
    }
}

fun main(){
    genericExample()
}