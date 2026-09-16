package systemDesign.loadbalancer;

public interface SmartApplication extends Application{
    int getConnections();
    int getWeight();
}
