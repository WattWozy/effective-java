
public class USPlug {
    private final int maxVolt;
    private final String type;

    public USPlug(int maxVolt, String type){
        this.maxVolt=maxVolt;
        this.type=type;
    }

    public void plugToGrid(){
        System.out.println("Plugged USPlug to stream");
    }

}