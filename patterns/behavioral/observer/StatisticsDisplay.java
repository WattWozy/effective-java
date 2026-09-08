
public class StatisticsDisplay implements Observer {

    private WeatherData weatherData;

    @Override
    public void update(WeatherData weatherData){
        this.weatherData = weatherData;
        System.out.println("Statistical observer: " + weatherData.toString());
    }
}