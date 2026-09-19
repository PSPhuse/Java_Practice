package multi_Threading;

public class MultiThread1 {
    public static void main(String[] args) throws Exception{
        MultipleThread m = new MultipleThread();

        new Thread()
        {
            @Override
            public void run()
            {
                m.prime();
            }
        }.start();

        new Thread()
        {
            @Override 
            public void run()
            {
                m.febonassi();
            }
        }.start();

        new Thread()
        {
            @Override 
            public void run()
            {
                m.duplicate();
            }
        }.start();
    }
}
