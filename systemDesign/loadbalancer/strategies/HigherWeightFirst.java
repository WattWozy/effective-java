package systemDesign.loadbalancer.strategies;

import systemDesign.loadbalancer.Application;
import systemDesign.loadbalancer.BaseApplication;
import systemDesign.loadbalancer.SmartApplication;
import systemDesign.loadbalancer.Strategy;

import java.util.List;

public class HigherWeightFirst implements Strategy {

    public int routingWeight(Application app) {
        return switch (app) {
            case SmartApplication smart -> smart.getWeight();
            case BaseApplication base -> 0; // flat weight for dumb apps
            default -> throw new IllegalStateException("Unexpected value: " + app);
        };
    }

    @Override
    public Application route(List<Application> instances) {
        int baselineWeight = 0;
        int highestIndex = 0;
        for(int i=0; i<instances.size(); i++){
            if(baselineWeight < routingWeight(instances.get(i))){
                highestIndex = i;
            }
        }
        return instances.get(highestIndex);
    }
}
