
public class Lambdas {

    public static void main(String[] args){
        Cat myCat = new Cat();


        myCat.print("meow"); //the object has a print method

        printThing(myCat); //the method accepts a functional interface

        printThing((s) -> { //lambda qualifies as a functional interface
            System.out.println("mowmow!");
        });

        myCat.printDefault();
    }

    public static void printThing(Printable printable){
        printable.print("meown!");
    }

}