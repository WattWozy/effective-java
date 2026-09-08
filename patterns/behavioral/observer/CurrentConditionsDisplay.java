
public class CurrentConditionsDisplay implements Observer {

    private WeatherData weatherData;

    @Override
    public void update(WeatherData weatherData){
        this.weatherData = weatherData;
        System.out.println("Current observer: " + weatherData.toString());
    }
}