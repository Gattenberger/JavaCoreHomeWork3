package JavaCoreHome6;

import okhttp3.OkHttpClient;

import javax.xml.transform.sax.SAXResult;
import java.io.IOException;
import java.util.Date;

public class WeatherModel {
//   http://dataservice.accuweather.com/forecasts/v1/daily/5day
    private static final String PROTOKOL = "http";
    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECASTS = "forecasts";
    private static final String VERSION = "v1";
    private static final String DAILY = "daily";
    private static final String FIVE_DAY = "5day";
    private static final String API_KEY = "nh3FxchuS9J1grpu0ppELyss7d91xYGF";
    private static final String API_KEY_QUERY_PARAM = "apikey";
    private static final String LOCATIONS = "locations";
    private static final String CITIES = "cities";
    private static final String AUTOCOMPLETE = "autocomplete";

    private static final OkHttpClient okHttpClient = new OkHttpClient();
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public void getWeather(String selectedCity, Period period) {
         {
            case FIVE_DAYS:
                HttpUrl httpUrl = new HttpUrl.Builder()
                        .scheme(PROTOKOL)
                        .host(BASE_HOST)
                        .addPathSegment(FORECASTS)
                        .addPathSegment(VERSION)
                        .addPathSegment(DAILY)
                        .addPathSegment(FIVE_DAY)
                        .addPathSegment(detectedCityKey(selectedCity))
                        .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                        .build();

                Request request = new Request.Builder()
                        .url(httpUrl)
                        .build();
                Response fiveDayForecastResponse = okHttpClient.newCall(request).execute();
                String weatherResponse = fiveDayForecastResponse.body().string()
                break;
        }
    }

    private String detectCityKey(String selectCity){
 //       http://dataservice.accuweather.com/locations/v1/cities/autocomplete
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme(PROTOKOL)
                .host(BASE_HOST)
                .addPathSegment(LOCATIONS)
                .addPathSegment(VERSION)
                .addPathSegment(CITIES)
                .addPathSegment(AUTOCOMPLETE)
                .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                .addQueryParameter("q", selectCity)
                .build();

        Request request = new Request.Builder()
                .url(httpUrl)
                .get()
                .addHeader("accept", "application/json")
                .build();

        Response Response = okHttpClient.newCall(request).execute();
        String responseString = response.body().string();


        String cityKey = objectMapper.readTree(responseString).get(0).at("/Key").asText();
        return responseString;

    }
    public static void main(String[] args) throws IOException {
        getWeather("Saint Petersburg", Period.FIVE_DAY));
    }
}
