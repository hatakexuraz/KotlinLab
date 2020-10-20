package Lab2

data class Fish(val name: String){
}

val fish = listOf(Fish("Flipper"),Fish("Moby Dick"),Fish("Dory"))
fun main(){
     println( fish.filter { it.name.contains("i") }.joinToString(", ") {it.name})
 }