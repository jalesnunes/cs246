package prove03;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;

public class WeatherForecastItem {

    String time;
    int temp;
    @SerializedName("weather")
    HashMap<String, String> conditions;
    @SerializedName("wind")
    HashMap<String, Float> wind;
}
