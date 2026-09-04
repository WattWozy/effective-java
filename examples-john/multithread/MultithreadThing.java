
// first way of multithreading: extending Thread.
public class MultithreadThing extends Thread {

    private final int threadNum;

    public MultithreadThing(int threadNum){
        this.threadNum = threadNum;
    }

    @Override
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(i + " from thread number " + threadNum);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){}
        }
    }

}