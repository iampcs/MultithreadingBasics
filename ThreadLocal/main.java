package MultithreadingBasics.ThreadLocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;

public class main {
    public static void main(String[] args) {

        new Thread(
                () -> System.out.println(usingThreadLocal())
        ).start();

        new Thread(
                () -> System.out.println(usingThreadLocal())
        ).start();

        new Thread(
                () -> System.out.println(usingThreadLocal())
        ).start();


    }

    // Function that runs in parrallel and used threadLocal
    public static String usingThreadLocal()
    {
        return UsingThreadLocal.localObject.get();
    }
}
