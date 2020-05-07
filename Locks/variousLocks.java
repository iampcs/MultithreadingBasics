package MultithreadingBasics.Locks;

import java.util.concurrent.locks.*;

public class variousLocks {

    Integer dummyMonitor = 10;
    Lock rLock = new ReentrantLock();

    public void dummyMethod() throws InterruptedException {
        synchronized (dummyMonitor)
        {
            dummyMonitor.wait();
        }

        rLock.lock();
        dummyMonitor.wait();
        rLock.unlock();

    }


}