

public class UStoEUadapter implements EUCompatibleAdapter {

    private final USPlug usPlug;

    public UStoEUadapter(USPlug usPlug){
        this.usPlug=usPlug;
    }

    @Override
    public boolean plugToGrid(){
        usPlug.plugToGrid(); //the adaptee must be called!
        return true;
    }
}


/* with inheritance example:
*
*

interface Target {
    void request();
}

class Adaptee {
    public void specificRequest() {
        System.out.println("Adaptee doing its thing");
    }
}

// Class Adapter version
class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();   // inherited method
    }
}
*
* */