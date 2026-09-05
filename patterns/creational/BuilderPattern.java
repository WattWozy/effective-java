

public class BuilderPattern {

    public static void main(String[] args) {
        //TELESCOPING BRUTE CONSTRUCTOR: Car newCar = new Car("", "", "", "" ...);
        //FACTORY METHOD: Car myGreenToyota = Car.greenToyotaBuilder();
        //BUILDER PATTERN:
        Car myCustomCar = Car.Builder
                .color("Green")
                .plate("1234abc")
                .brand("Toyota")
                .model("Prius")
                .mileage(0)
                .build();
    }


    private static class Car {

        private final String color;
        private final String plate;
        private final String brand;
        private final String model;
        private long mileage;
        
        private Car(
                String color,
                String plate,
                String brand,
                String model,
                long mileage) {
            this.color = color;
            this.plate = plate;
            this.brand = brand;
            this.model = model;
            this.mileage = mileage;
        }

        public static class Builder {
            private String color;
            private String plate;
            private String brand;
            private String model;
            private long mileage;

            public Builder color(String color) {
                this.color = color;
                return this;
            }

            public Builder plate(String plate) {
                this.plate = plate;
                return this;
            }

            public Builder brand(String brand) {
                this.brand = brand;
                return this;
            }

            public Builder model(String model) {
                this.model = model;
                return this;
            }

            public Builder mileage(long mileage) {
                this.mileage = mileage;
                return this;
            }

            public Car build() {
                return new Car(color, plate, brand, model, mileage);
            }
        }
    }
}