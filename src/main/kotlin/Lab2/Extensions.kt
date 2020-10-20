package Lab2

fun String.hasSpaces(): Boolean {
    val found = this.find { it == ' ' }
    return found != null
}

//OR
//Can be reduced to single line
//fun String.hasSpaces() = find { it == ' ' } != null