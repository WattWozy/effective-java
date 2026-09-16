package systemDesign.loadbalancer;

import java.util.List;

public interface Balance {

    Application route(List<Application> instances);

    public void addInstance(Application app);

    public void removeInstance(Application app);

}