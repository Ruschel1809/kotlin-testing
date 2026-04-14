class WeatherForecast {
    fun predictTemperature(day: String): Int {
        return when (day) {
            "Montag" -> 20
            "Dienstag" -> 22
            "Mittwoch" -> 18
            "Donnerstag" -> 24
            "Freitag" -> 21
            "Samstag" -> 19
            "Sonntag" -> 23
            else -> throw IllegalArgumentException("Ungültiger Tag")
        }
    }
}