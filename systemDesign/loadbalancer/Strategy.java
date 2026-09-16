package systemDesign.loadbalancer;

import java.util.List;

public interface Strategy{
    Application route(List<Application> instances);
}