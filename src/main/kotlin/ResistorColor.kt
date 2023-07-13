private enum class ColorCodes {
    black,
    brown,
    red,
    orange,
    yellow,
    green,
    blue,
    violet,
    grey,
    white
}

object ResistorColor {

    fun colorCode(input: String) = ColorCodes.valueOf(input).ordinal

    fun colors(): List<String> = ColorCodes.values().map { a -> a.name }
}
