package multi_Threading;

public class MultiThread2 {

    public static void main(String[] args) throws InterruptedException {
    
        MultipleThread m1 = new MultipleThread();

        Thread t1 = new Thread()
        {
            @Override 
            public void run()
            {
                m1.prime();
            }
        };
        t1.setPriority(10);
        t1.start();
        t1.join();

        Thread t2 = new Thread()
        {
            @Override 
            public void run()
            {
                m1.febonassi();
            }
        };
        t2.setPriority(10);
        t2.start();
        t2.join();

        Thread t3 = new Thread()
        {
            @Override 
            public void run()
            {
                m1.duplicate();
            }
        };
        t3.start();
    }
}
