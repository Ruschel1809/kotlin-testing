import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TemperatureConverterTest {
    private val converter = TemperatureConverter()
    @Test
    fun testCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0.0), 0.001)
        assertEquals(-459.67, converter.celsiusToFahrenheit(-273.15), 0.001)
    }
    @Test
    fun testFahrenheitToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32.0), 0.001)
        assertEquals(-273.15, converter.fahrenheitToCelsius(-459.67), 0.001)
    }
    @Test
    fun testCelsiusToKelvin() {
        assertEquals(273.15, converter.celsiusToKelvin(0.0), 0.001)
        assertEquals(0.0, converter.celsiusToKelvin(-273.15), 0.001)
    }
    @Test
    fun testKelvinToCelsius() {
        assertEquals(0.0, converter.kelvinToCelsius(273.15), 0.001)
        assertEquals(-273.15, converter.kelvinToCelsius(0.0), 0.001)
    }
}