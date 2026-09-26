package systemDesign.loadbalancer;

import java.util.ArrayList;
import java.util.List;

public class Balancer{

    private List<Application> instances;
    private int instancePointer;

    public Balancer(){
        this.instances = new ArrayList<>();
        this.instancePointer = 0;
    }

    //accepting requests
    public void send(String request){
        if(request != null){
            route(request);
        }
        else{
            throw new IllegalArgumentException("Balancer received a null request");
        }
    }

    //rerouting requests
    public void route(String request){
        if(!instances.isEmpty()){
            instances.get(instancePointer).send(request);
            updatePointer();
        }
    }

    //updating the instance pointer
    private void updatePointer(){
        int currentSize = instances.size();
        instancePointer++;
        if(instancePointer >= instances.size()){
            instancePointer = 0;
        }
    }


    //modifying the services that the balancer holds
    public void addInstance(Application app){
        if(instances.contains(app)){
            return;
        }
        else{
            this.instances.add(app);
        }
    }

    public void removeInstance(Application app){
        if(instances.contains(app)){
            instances.remove(app);
        }
    }

}