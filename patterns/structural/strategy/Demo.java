import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Demo{

    public static void main(String[] args){
        List<String> exampleList = new ArrayList<>(
                List.of(
                        "asdqwer", "qwerasd", "ertyuik", "pweortl", "aaertt"
                )
        );
        for(String a : exampleList){
            System.out.println("item: " + a);
        }

        List<String> sortedExampleList = Inject.sortCollection(exampleList, Collections::sort);

        for(String a : exampleList){
            System.out.println("sorted: " + a);
        }

        double sumResult = math(2, 5, Select::sum);
        System.out.println("Sum result = " + sumResult);

        double subResult = math(5, 2, Select::sub);
        System.out.println("Sub result = " + subResult);

        double customResult = math(5, 2, (a, b) -> ((a*b)/(a+b)));
        System.out.println("Custom result = " + customResult);
    }

    public static double math(int a, int b, MathStrategy op){
        return op.apply(a,b);
    }

}