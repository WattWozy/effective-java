import java.util.List;

//Sortstrategy is a functional interface, as it has one abstract method, representable by a lambda

public interface SortStrategy {
    public abstract void sort(List<String> list);
}