package prove03;


import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Please enter a city: ");
        Scanner userCity = new Scanner(System.in);
        String city = userCity.nextLine();
        userCity.close();


        Deserializer deserializer = new Deserializer(city);

        sendRequestWeather(city, deserializer);

        WeatherConditions weatherConditions = deserializer.getDeserialize();

        System.out.println("Current Weather Conditions:");
        System.out.println("City id: " + weatherConditions.id);
        System.out.println("City name: " + weatherConditions.name);
        System.out.println("Current Temp: " + weatherConditions.measurements.get("temp") +" C");
        System.out.println("Current presure: " + weatherConditions.measurements.get("pressure"));

        System.out.println("\n");


        Deserializer deserializer1 = new Deserializer(city);

        sendRequestWeatherForcast(city, deserializer1);

        //WeatherForecast WeatherForecast = deserializer.getDeserialize();;

        System.out.println("5 - Day Forecast");
        System.out.println(); //TODO: Left here

    }

    public static void sendRequestWeather(String city, Deserializer deserializer) throws IOException {

        String url = "https://api.openweathermap.org/data/2.5/weather";
        String charset = "UTF-8";
        String units = "metric";
        String api = "ae95ce2a887b9fc978ecbfa9c7f181cf";

        String query = String.format("q=%s&units=%s&apiKey=%s",
                URLEncoder.encode(city, charset),
                URLEncoder.encode(units, charset),
                URLEncoder.encode(api, charset));

        URLConnection connection = new URL(url + "?" + query).openConnection();


        connection.setRequestProperty("Accept-Charset", charset);
        InputStream response = connection.getInputStream();


        try (Scanner scanner = new Scanner(response)) {

            deserializer.setData(scanner.useDelimiter("\\A").next());

            //String responseBody = scanner.useDelimiter("\\A").next();
            //System.out.println(responseBody);
        }
    }

    public static void sendRequestWeatherForcast(String city, Deserializer deserializer) throws IOException {

        String url = "https://api.openweathermap.org/data/2.5/weather";
        String charset = "UTF-8";
        String units = "metric";
        //String api = "Put your API key here";

        String query = String.format("q=%s&units=%s&apiKey=%s",
                URLEncoder.encode(city, charset),
                URLEncoder.encode(units, charset),
                URLEncoder.encode(api, charset));

        URLConnection connection = new URL(url + "?" + query).openConnection();


        connection.setRequestProperty("Accept-Charset", charset);
        InputStream response = connection.getInputStream();


        try (Scanner scanner = new Scanner(response)) {

            deserializer.setData(scanner.useDelimiter("\\A").next());

            //String responseBody = scanner.useDelimiter("\\A").next();
            //System.out.println(responseBody);
        }
    }

}
