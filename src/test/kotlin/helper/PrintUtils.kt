package helper

fun <T> Array<T>.print() {
    this.joinToString(prefix = "[", postfix = "]", separator = ",")
}