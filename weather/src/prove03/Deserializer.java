package prove03;

import com.google.gson.Gson;
import java.lang.String;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Scanner;

public class Deserializer {
    String data;
    WeatherConditions weather;
    String city;

    public Deserializer(String city) {
        this.city = city;
        this.weather = new WeatherConditions();

    }

    public WeatherConditions getDeserialize(){

        // Variables
        Gson gson = new Gson();

        // Deserialize
        weather = gson.fromJson(data, WeatherConditions.class);

        return weather;
    }

    public String getData()
    {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
}
