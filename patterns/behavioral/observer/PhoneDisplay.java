
public class PhoneDisplay implements Observer {

    private WeatherData weatherData;

    @Override
    public void update(WeatherData weatherData){
        this.weatherData = weatherData;
        System.out.println("Phone observer: " + weatherData.toString());
    }
}