package systemDesign.loadbalancer.instances;

import systemDesign.loadbalancer.SmartApplication;

public class SmartAppInstance extends AppInstance implements SmartApplication {

    private int connections;
    private final int weight;

    public SmartAppInstance(String name, int weight) {
        super(name);
        this.weight=weight;
        this.connections=0;
    }

    public int getConnections(){
        return this.connections;
    }

    public void newConnection(){
        this.connections += 1;
    }
    public void quitConnection(){
        if(connections <= 0)
            return;
        this.connections -= 1;
    }
    public int getWeight(){
        return this.weight;
    }
}
