
//the whole idea of building with factory patterns: hiding creational detail when unnecessary.
//encapsulating implementation details that client is not interested about.

public class FactoryMethodPattern{

    public static void main(String[] args){
        Car myNewPrius = Car.newDefaultPrius("1234abc");
        Car myNewTesla = Car.newDefaultTesla("1234abd");
        Car myNewBMW = Car.newDefaultBMW("1234abe");
    }

    public class Car{
        private final String color;
        private final String plate;
        private final String brand;
        private final String model;
        private long mileage;

        private Car(String color, String plate, String brand, String model, long mileage){
            this.color=color;
            this.plate=plate;
            this.brand=brand;
            this.model=model;
            this.mileage=mileage;
        }

        public static Car newDefaultPrius(String plate){
            return new Car("Gray", plate, "Toyota", "Prius", 0);
        }
        public static Car newDefaultTesla(String plate){
            return new Car("White", plate, "Tesla", "X", 0);
        }
        public static Car newDefaultBMW(String plate){
            return new Car("Black", plate, "BMW", "412d", 0);
        }
    }

}