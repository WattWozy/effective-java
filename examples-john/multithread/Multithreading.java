
public class Multithreading {

    public static void main (String[] args){

        /*
        *
        * You can instantiate a new thread by
        * 1) extending the class Thread, and calling start() or run()
        * 2) implementing Runnable, and creating a new thread, passing the object that implements run()
        *
        * */

        // run() will execute sequentally, start() in parallel
        /**
         myThing.run();
         myThing2.run();

         myThing.start();
         myThing2.start();
         */

        // for creating several threads (extended Thread)
        for(int i=0; i<5; i++){
            MultithreadThing myThing = new MultithreadThing(i);
            myThing.start();
        }

        // for creating several threads (implementing Runnable)
        for(int i=0; i<5; i++){
            RunThread myThing = new RunThread(i);
            Thread myThread = new Thread(myThing);
            myThread.start();
        }

        // useful methods.
        /**
         * thread.join() -> stops the program till the thread is done
         * thred.isAlive() -> if complete then True;
         * ...
         */
        /

    }

}