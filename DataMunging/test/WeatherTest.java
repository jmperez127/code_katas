import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeatherTest {
    Weather weather;
    @Before
    public void setUp() {
        weather = new Weather();
    }

    @Test
    public void testWeatherData() {
        assertEquals(80, weather.getSmallestTemperatureDay());
    }

}
