
class DecoratedDecorator implements CoffeeMachine {

    private CoffeeMachine proCoffeeMachine;

    public DecoratedDecorator(CoffeeMachine proCoffeeMachine) {
        this.proCoffeeMachine=proCoffeeMachine;
    }

    public String getName(){
        return proCoffeeMachine.getName();
    }

    public boolean hasCoffee(){
        return proCoffeeMachine.hasCoffee();
    }

    public void pourCoffee(){
        proCoffeeMachine.pourCoffee();
        String salutedPouring = "Enjoy your drink! :)";
        System.out.println(salutedPouring);
    }

    public void refill(){
        proCoffeeMachine.refill();
    }
    public void empty(){
        proCoffeeMachine.empty();
    }
}