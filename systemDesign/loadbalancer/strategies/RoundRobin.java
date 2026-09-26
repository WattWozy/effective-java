package systemDesign.loadbalancer.strategies;

import systemDesign.loadbalancer.Application;
import systemDesign.loadbalancer.Strategy;

import java.util.List;

class RoundRobin implements Strategy{

    int MAX_INSTANCE_RETRIES = 3;

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
}
