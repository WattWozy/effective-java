
interface EUCompatibleAdapter{
    public boolean plugToGrid();
}

public class EUPlug {
    private final int maxVolt;
    private final String type;
    private boolean isPlugged;

    public EUPlug(int maxVolt, String type){
        this.maxVolt=maxVolt;
        this.type=type;
        this.isPlugged=false;
    }

    public boolean isPluggedToGrid(){
        return this.isPlugged;
    }

    public boolean plugToGrid(){
        this.isPlugged=true;
        System.out.println("power now available");
        return this.isPlugged;
    }
}