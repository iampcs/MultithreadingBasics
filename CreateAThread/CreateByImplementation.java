package MultithreadingBasics.CreateAThread;

public class CreateByImplementation implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread Running:" + Thread.currentThread().getName());
    }
}
