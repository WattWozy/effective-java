package systemDesign.loadbalancer;

public interface Application {

    boolean send(String request);

    boolean health();

}