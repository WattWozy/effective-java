
public class RunThread implements Runnable {

    private int threadNum;
    public RunThread (int threadNum){
        this.threadNum = threadNum;
    }

    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(i + " from RUN-thread number " + threadNum);
        }
        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){

        }
    }

}