import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        WeatherInfo[] weatherInfo = new WeatherInfo[n];

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate closestRainDate = null;
        WeatherInfo closestRainInfo = null;

        for(int i = 0; i < n; i++) {
            String date = sc.next();
            String dayOfWeek = sc.next();
            String weather = sc.next();
            
            weatherInfo[i] = new WeatherInfo(date, dayOfWeek, weather);

            if(weather.equals("Rain")) {
                LocalDate currentDate = LocalDate.parse(date, formatter);
                
                if(closestRainDate == null || currentDate.isBefore(closestRainDate)) {
                    closestRainDate = currentDate;
                    closestRainInfo = weatherInfo[i];
                }
            }
        }

        if(closestRainInfo != null) {
            System.out.println(closestRainInfo.date + " " + closestRainInfo.dayOfWeek + " " + closestRainInfo.weather);
        }
    }
}

class WeatherInfo {
    String date, dayOfWeek, weather;

    public WeatherInfo(String date, String dayOfWeek,String weather) {
        this.date = date;
        this.dayOfWeek = dayOfWeek;
        this.weather = weather;
    }
}