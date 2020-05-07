package MultithreadingBasics.ThreadLocal;


//Object(Its string here) to be used by function which many threads will be executing in parrallel.
//Here localObject is supplying object to our threads.
public class UsingThreadLocal{
    public  static ThreadLocal<String> localObject = ThreadLocal.withInitial(
            () -> "Thread Calling me is " + Thread.currentThread().getName()
    );
}
