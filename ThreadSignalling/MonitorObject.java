package MultithreadingBasics.ThreadSignalling;

import java.util.concurrent.TimeUnit;

// Monitor Object that implements its own wait() and notify() method for better thread signalling
public class MonitorObject {

    // notify()  and notifyAll does't store state. In case notify() is called before wait(), signal will be missed
    // So we store it in a flag and waiting thread checks for this flag in a loop -> Spin Lock
    boolean notifyFlag = false;
    Integer dummyMonitor = 0;

    public void customWait() throws InterruptedException {
        synchronized (dummyMonitor)
        {
            // wait() can only if called inside synchronized block else it will throw IllegalMonitorStateException
            // wait() throws Interrupted Exception and needs to be handles.

            System.out.println("Thread " + Thread.currentThread().getName() + "waiting to get lock");
            while(!notifyFlag)
            {
                System.out.println("Thread " + Thread.currentThread().getName() + "got lock, will be going to wait state");
                dummyMonitor.wait();
            }
        }

        // Resetting notify flag on exit.
        System.out.println("Thread " + Thread.currentThread().getName() + "My work is done, resetting the notify Flag");
        notifyFlag = false;

    }

    public void customNotify()
    {
        synchronized (dummyMonitor)
        {
            System.out.println("Thread " + Thread.currentThread().getName() + "Going to execute notifyAll");
            dummyMonitor.notifyAll();
            notifyFlag = true;
        }
    }

}
