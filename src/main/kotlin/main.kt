
fun main() {
    val likes: Int = (0..1000).random()

    val result = if (likes.toString().endsWith("1") && !likes.toString().endsWith("11")) "человеку" else "людям"

    println("Понравилось $likes $result")
}