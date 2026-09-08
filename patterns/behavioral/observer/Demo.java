
class Demo {

    public static void main(String[] args){
        WeatherStation station = new WeatherStation("AEMET");

        CurrentConditionsDisplay ccDisplay= new CurrentConditionsDisplay();
        PhoneDisplay iphoneDisplay = new PhoneDisplay();
        StatisticsDisplay statDisplay = new StatisticsDisplay();

        station.subscribe(ccDisplay);
        station.subscribe(iphoneDisplay);
        station.subscribe(statDisplay);

        for(int i=0; i<10; i++){
            station.generateData();
        }
    }

}