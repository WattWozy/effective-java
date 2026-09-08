import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

class WeatherStation implements Subject{

    private String name;
    private List<Observer> observerList;
    private int temperature;
    private int humidity;
    private int pressure;
    private WeatherData weatherData;

    public WeatherStation(String name){
        this.name=name;
        this.observerList = new ArrayList<Observer>();
    }

    public int getTemperature(){
        return this.temperature;
    }

    public int getHumidity(){
        return this.humidity;
    }

    public int getPressure(){
        return this.pressure;
    }

    public void generateData(){
        this.temperature = (int) (Math.random() * 50);
        this.humidity = (int) (Math.random() * 3000);
        this.pressure = (int) (Math.random() * 2000);
        this.weatherData = new WeatherData(temperature, humidity, pressure);
        notifyObservers();
    }

    public void subscribe(Observer observer){
        if(!observerList.contains(observer)){
            this.observerList.add(observer);
        }
    }

    public void unsubscribe(Observer observer){
        if(observerList.contains(observer)){
            this.observerList.remove(observer);
        }
    }

    @Override
    public void notifyObservers(){
        for(Observer observer : observerList){
            observer.update(weatherData);
        }
    }
}