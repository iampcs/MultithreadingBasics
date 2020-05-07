package MultithreadingBasics.ThreadInteruption;

import java.time.LocalDate;
import java.time.LocalDateTime;

/* We are checking if thread is interrupted and handling it
* isInterrupted() only comes with Thread extension*/
public class ThreadInteruptionExample extends Thread {

    @Override
    public void run() {
        while(true)
        {
            System.out.println(LocalDateTime.now());

            if(isInterrupted())
            {
                System.out.println("Thread %s is interrupted "+ Thread.currentThread().getName());
                return;
            }
        }

    }
}
