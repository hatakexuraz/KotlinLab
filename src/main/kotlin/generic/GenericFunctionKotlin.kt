package generic

//making a generic function is a good idea whenever
// the function takes an argument of a class that has a generic type.
fun <T : WaterSupply> isWaterClean(aquarium: Aquarium<T>){
    println("aquarium water is clean: ${aquarium.waterSupply.needsProcessing}")
}

fun genericExample2(){
    val aquarium = Aquarium(TapWater())
    isWaterClean<TapWater>(aquarium)        //can add type after the function name inside <> as well
}

fun main(){
    genericExample2()
}