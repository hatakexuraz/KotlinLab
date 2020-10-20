package Lab2


const val value = 1
fun main(){
    val equipment = "fish net" to "catching fish"
    println("${equipment.first} used for ${equipment.second}\n")

    val numbers = Triple(6, 9, "catching fish")
    println(numbers.toString())
    println(numbers.toList())
    println("First: ${numbers.first}  Second: ${numbers.second} Third: ${numbers.third}\n")

    val equipment2 = ("fish net" to "catching fish") to "equipment"
    println("${equipment2.first} is ${equipment2.second}")
    println("${equipment2.first.second}\n")

    //Using destructure  with pair
    val equipment3 = "fish net" to "catching fish"
    val (tool, use) = equipment3
    println("$tool is used for $use\n")

    //Using destructure  with triple
    val numbers2 = Triple(6, 9, "fish net")
    val (n1, n2, n3) = numbers2
    println("$n1 $n2 $n3\n")


    //HASHMAP

    //In Kotlin, you can map pretty much anything to anything else using hashMapOf().
    // Hash maps are sort of like a list of pairs, where the first value acts as a key.
    val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")
    println(cures.get("white spots"))
    println(cures["red sores"])
    println(cures["scale loss"])
    //If the key is not available and you have to give default value rather than null
    println(cures.getOrDefault("bloating", "sorry, I don't know"))

    //If you need to do more than just return a value, Kotlin provides the getOrElse() function.
    println(cures.getOrElse("bloating") { //TODO
        val a= 1
        val sum = a+4
        "No cure for this $sum \n"})


    val inventory = mutableMapOf("fish net" to 2)
    inventory.put("tank scrubber", 3)
    println(inventory.toString())
    inventory.remove("fish net")
    println(inventory.toString()+"\n")

    println(MyClass.CONSTANT3)

    //A extension function is created in Extension.kt which can be accessed as in-built function
    //just by typing the name of the function
    println("Does it have spaces?".hasSpaces())
    print("\n")



    val plant = GreenLeafyPlant(size = 10)
    plant.print()
    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()  // what will it print?
}


class MyClass {
    //A companion object is like a static method that allows to access the members available inside
    //of it without initializing the object
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}

open class AquariumPlant(val color: String, private val size: Int)

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")
