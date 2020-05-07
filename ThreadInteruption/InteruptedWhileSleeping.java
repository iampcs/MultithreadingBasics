package MultithreadingBasics.ThreadInteruption;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class InteruptedWhileSleeping implements Runnable {

    @Override
    public void run() {
        boolean flag = true;
        while(flag)
        {
            System.out.println("Printing Time:" + LocalDateTime.now());
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted " + Thread.currentThread().getName());
                flag = false;
            }
        }
    }
}
