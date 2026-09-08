
class CoffeeComponent implements CoffeeMachine{

    private final String name;
    private boolean hasCoffee;

    public CoffeeComponent(String name){
        this.name=name;
        this.hasCoffee=false;
    }

    public String getName() {
        return name;
    }

    public boolean hasCoffee() {
        return hasCoffee;
    }

    public void pourCoffee(){
        System.out.println("Pouring coffee from " + name);
    }

    public void refill() {
        this.hasCoffee = true;
    }

    public void empty(){
        this.hasCoffee = false;
    }
}