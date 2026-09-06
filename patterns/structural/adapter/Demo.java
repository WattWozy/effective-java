
public class Demo{

    public static void main(String[] args){

        USPlug americanPlug = new USPlug(21, "type A");

        EUCompatibleAdapter adapter = new UStoEUadapter(americanPlug);

        boolean success = adapter.plugToGrid();

        System.out.println("Success ? " + success);
    }

}