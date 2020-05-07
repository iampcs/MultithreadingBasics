package MultithreadingBasics.SynchronizationHell;

import java.util.concurrent.TimeUnit;

public class TypesOfSynchronizedBlocks {

    //We can synchronize of an external monitor in case of synchronized blocks for fine locking but I am using this class itself as Monitor

    // Synchronized method , locks on Instance of Class

    public synchronized  void synchronizedMethod() throws InterruptedException {


        System.out.println("synchronizedMethod Running from " + Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(3);
        System.out.println("synchronizedMethod Over for " + Thread.currentThread().getName());

    }

    // Synchronized block, locks on Instance of Class , Preferred as it only blocks a part of method instead of whole method.
    public  void synchronizedBlock() throws InterruptedException {
        synchronized (this)
        {

            System.out.println("synchronizedBlock Running from " + Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(3);
            System.out.println("synchronizedBlock Over for  " + Thread.currentThread().getName());
        }
    }

    // Static Synchronized method , locks on Class as static methods belongs to Class
    public static synchronized void  staticSynchronizedMethod() throws InterruptedException {

        System.out.println("staticSynchronizedMethod Running from " + Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(3);
        System.out.println("staticSynchronizedMethod Over for  " + Thread.currentThread().getName());
    }

    // Static Synchronized block, locks on Class , Preferred as it only blocks a part of method instead of whole method.
    public  static void staticSynchronizedBlock() throws InterruptedException {
        synchronized (TypesOfSynchronizedBlocks.class)
        {

            System.out.println("staticSynchronizedBlock Running from " + Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(3);
            System.out.println("staticSynchronizedBlock Over for " + Thread.currentThread().getName());
        }
    }
}
