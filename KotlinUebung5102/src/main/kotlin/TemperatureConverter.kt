class TemperatureConverter {
    fun celsiusToFahrenheit(celsius: Double): Double = (celsius * 9/5) + 32
    fun fahrenheitToCelsius(fahrenheit: Double): Double = (fahrenheit - 32) * 5/9
    fun celsiusToKelvin(celsius: Double): Double = celsius + 273.15
    fun kelvinToCelsius(kelvin: Double): Double = kelvin - 273.15
}