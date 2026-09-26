package systemDesign.loadbalancer;

import java.util.List;

public class StrategyBalancer implements Balance {

    private TolerantBalancer tlb;
    private Strategy routeStrategy;

    public StrategyBalancer(TolerantBalancer tlb, Strategy routeStrategy){
        this.tlb=tlb;
        this.routeStrategy=routeStrategy;
    }

    @Override
    public Application route(List<Application> instances){
        //we are accepting Application list, not restricting to SmartApplications...

        return routeStrategy.route(instances);
    }

    @Override
    public void addInstance(Application app){
        tlb.addInstance(app);
    }

    @Override
    public void removeInstance(Application app){
        tlb.removeInstance(app);
    }

}