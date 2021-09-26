package helper

fun String.toIntArray(): IntArray {
    return removePrefix("[").removeSuffix("]").split(",")
        .mapNotNull { it.toIntOrNull() }.toIntArray()
}