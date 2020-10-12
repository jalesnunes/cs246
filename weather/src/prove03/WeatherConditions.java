package prove03;

import java.util.*;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class WeatherConditions {
    Gson gson = new Gson();

    int id;
    String name;
    @SerializedName("main")
    Map<String, Float> measurements  = new HashMap<String, Float>();


}

