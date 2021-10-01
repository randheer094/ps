package helper

fun String.toIntArray(): IntArray {
    return removePrefix("[").removeSuffix("]").split(",")
        .mapNotNull { it.toIntOrNull() }.toIntArray()
}

inline fun <reified T> String.toArrayOf(): Array<T> {
    val content = removePrefix("[").removeSuffix("]").split(",")
    return when (T::class) {
        IntArray::class -> content.map { it.toIntArray() }.toTypedArray() as Array<T>
        else -> content.mapNotNull { it as T }.toTypedArray()
    }
}