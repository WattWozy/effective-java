//functional interface enforces the interface to have only ONE abstract interface
//there can be default and static methods, but there should only be one abstract method.
@FunctionalInterface
public interface Printable {
    public void print(String s);

    //does not break the functional interface to add a default one
    public default void printDefault(){
        System.out.println("printDefault!");
    }

    //you can nest interfaces on interfaces, you don't need to implement them
    public interface Suffix{
        public void withSuffix(String s);
    }
    public interface Prefix{
        public void withPrefix(String p);
    }
}