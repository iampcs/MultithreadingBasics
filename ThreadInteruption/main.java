package MultithreadingBasics.ThreadInteruption;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class main {
    public static void main(String[] args) throws Exception{
        ThreadInteruptionExample threadInteruptionExample = new ThreadInteruptionExample();
        System.out.println("Manual interruption handling");
        threadInteruptionExample.start();

        Thread.sleep(10);

        threadInteruptionExample.interrupt();

        System.out.println("Handling interrupt by Exception");
        Runnable target;
        Thread thread = new Thread(new InteruptedWhileSleeping());
        thread.start();
        TimeUnit.SECONDS.sleep(3);
        thread.interrupt();
    }
}
