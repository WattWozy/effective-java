
class Demo{

    public static void main(String[] args){
        CoffeeComponent plainCoffeeMachine = new CoffeeComponent("ZetaCofee");
        plainCoffeeMachine.refill();
        plainCoffeeMachine.pourCoffee();

        DecoratedComponent proCoffeeMachine = new DecoratedComponent(plainCoffeeMachine, 5);
        proCoffeeMachine.refill();
        proCoffeeMachine.pourCoffee();

        DecoratedDecorator superCoffeeMachine = new DecoratedDecorator(proCoffeeMachine);
        superCoffeeMachine.refill();
        superCoffeeMachine.pourCoffee();

        DecoratedDecorator directCoffee =
                new DecoratedDecorator(
                    new DecoratedComponent(
                        new CoffeeComponent("BrilloCoffee"), 10
                    )
                );
        directCoffee.refill();
        directCoffee.pourCoffee();
    }
}