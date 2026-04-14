import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class WeatherForecastTest {
    private val weatherForecast = WeatherForecast()
    @Test
    fun testPredictTemperature() {
        assertEquals(20, weatherForecast.predictTemperature("Montag"))
        assertEquals(22, weatherForecast.predictTemperature("Dienstag"))
        assertEquals(18, weatherForecast.predictTemperature("Mittwoch"))
        assertEquals(24, weatherForecast.predictTemperature("Donnerstag"))
        assertEquals(21, weatherForecast.predictTemperature("Freitag"))
        assertEquals(19, weatherForecast.predictTemperature("Samstag"))
        assertEquals(23, weatherForecast.predictTemperature("Sonntag"))
    }
    @Test
    fun testPredictTemperatureWithInvalidDay() {
        assertThrows<IllegalArgumentException> {
            weatherForecast.predictTemperature("FalscherTag")
        }
    }
}