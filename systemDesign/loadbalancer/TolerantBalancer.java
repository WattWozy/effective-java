package systemDesign.loadbalancer;

import java.util.ArrayList;
import java.util.List;

public class TolerantBalancer implements Balance {

    private final List<Application> instances;
    private final int MAX_INSTANCE_RETRIES;

    public TolerantBalancer(){
        this.instances = new ArrayList<>();
        this.MAX_INSTANCE_RETRIES = 3;
    }

    //accepting requests
    public void send(String request){

        if(instances.isEmpty()){ return; }

        Application candidate = route(instances);

        if(candidate!=null){
            boolean result = candidate.send(request);
        } else {
            throw new IllegalArgumentException("no instances found");
        }

    }

    //round-robin implementation
    public Application route(List<Application> instances){
        for(Application app : instances){
            for(int i=0; i<MAX_INSTANCE_RETRIES; i++){
                if(app.health()){
                    return app;
                }
            }
        }
        return null;
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