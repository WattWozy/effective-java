
class DecoratedComponent implements CoffeeMachine{

    private CoffeeMachine coffeeComponent;
    private final int MAX_SERVINGS;
    private int remainingServings;

    public DecoratedComponent(CoffeeMachine coffeeComponent, int maxServings){
        this.coffeeComponent=coffeeComponent;
        this.MAX_SERVINGS=maxServings;
        this.remainingServings=0;
    }

    public String getName(){
        return coffeeComponent.getName();
    }

    public boolean hasCoffee(){
        return coffeeComponent.hasCoffee();
    }

    public void pourCoffee(){
        if(coffeeComponent.hasCoffee()){
            coffeeComponent.pourCoffee();
            this.remainingServings = remainingServings - 1;
            if(remainingServings==0){
                empty();
            }
            System.out.println("Remaining servings: " + remainingServings);
        }
        else {
            System.out.println("Please refill the machine!");
        }
    }

    public void refill(){
        coffeeComponent.refill();
        this.remainingServings=MAX_SERVINGS;
    }

    public void empty(){
        coffeeComponent.empty();
        this.remainingServings=0;
    }
}