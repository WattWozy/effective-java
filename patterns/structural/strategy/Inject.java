import java.util.List;

public class Inject {
    public static List<String> sortCollection(List<String> list, SortStrategy algorithm){
        algorithm.sort(list);
        return list;
    }
}