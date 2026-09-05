
public class AbstractFactoryPattern{

    public static void main(String[] args){

    }

    class CarFactory{
        private final String company;
        private final String continent;
        private final String country;
        private final FactoryMethodPattern carFactoryPattern;

        //some constructor (canonical if not explicit?)
        private CarFactory(String company, String continent, String country, FactoryMethodPattern carFactoryPattern){
            this.company=company;
            this.continent=continent;
            this.country=country;
            this.carFactoryPattern=carFactoryPattern;
        }

        public static CarFactory newTeslaInGermany(FactoryMethodPattern carFactoryPattern){
            //default logic for binding stuff together...
            return new CarFactory("Tesla", "Europe", "Germany", carFactoryPattern);
        }

        //methods:
        //european deafult tesla
        public Car newDefaultCar(){
            String newPlate = generatePlate(country, "abc1234");
            return carFactoryPattern.newDefaultTesla(newPlate);
        }

        /*
        public Vehicle newDefaultTruck(){}

        public Vehicle newDefaultVan(){}

        .... creation
         */

        //generate a plate for the new car
        private String generatePlate(String country, String random){
            return country + random;
        };

        //place order method
        public void ship(){
            System.out.println("your car is now being shipped!");
        }

    }

}