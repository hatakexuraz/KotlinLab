package annotation_example

data class Fish (var name: String)

fun fishExamples() {
    val fish = Fish("splashy")  // all lowercase
}

fun main(){
    fishExamples()
}