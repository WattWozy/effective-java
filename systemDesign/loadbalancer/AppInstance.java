package systemDesign.loadbalancer.instances;

import systemDesign.loadbalancer.Application;

public non-sealed class AppInstance implements Application {

    private final String name;
    private boolean health;

    public AppInstance(String name){
        this.name=name;
        this.health = true;
    }

    public boolean send(String request){
        System.out.println(name + " received: " + request);
        return true;
    }

    public void kill(){
        this.health = false;
    }

    public void spawn(){
        this.health = true;
    }

    public boolean health(){
        return health;
    }
}