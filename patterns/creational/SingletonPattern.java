//also using Java's enum object, or @Singleton in runtime (spring)

public class SingletonPattern{

    public static void main(String[] args){

        OrderTracker tracker = OrderTracker.getInstance();
        tracker.trackOrder("12345");

        //using the enum...
        OrderTrackerEnum.INSTANCE.trackOrder("12345");
    }

    public static class OrderTracker{

        private static final OrderTracker INSTANCE;

        private OrderTracker(){/*handle, bind, read... whatever*/}

        public getInstance(){
            if(INSTANCE!=null){
                return this;
            }
            else{
                return new OrderTracker();
            }
        }

        public void trackOrder(String orderId) {
            System.out.println("Tracking order: " + orderId);
        }
    }

    //default way of implementing a singleton, is using java's enum
    public enum OrderTrackerEnum {
        INSTANCE;

        private String trackerKey;

        OrderTracker() {
            this.trackerKey = "DEFAULT_KEY";
        }

        public void trackOrder(String orderId) {
            System.out.println("Tracking order: " + orderId + " using key: " + trackerKey);
        }
    }
}