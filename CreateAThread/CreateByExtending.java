package MultithreadingBasics.CreateAThread;

public class CreateByExtending extends Thread{

    @Override
    public void run()
    {
        System.out.println("Thread Running:" + Thread.currentThread().getName());
    }

}
