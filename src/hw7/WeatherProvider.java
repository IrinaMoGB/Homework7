package hw7;

import com.fasterxml.jackson.databind.JsonMappingException;
import hw7.enums.Periods;
import java.io.IOException;

public interface WeatherProvider {
    void getWeather(Periods periods) throws IOException;

}
