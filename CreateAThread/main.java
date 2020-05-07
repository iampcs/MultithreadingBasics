package MultithreadingBasics.CreateAThread;

public class main{
    public static void main(String[] args) {

        /* Only way to start a thread is by calling start() function. If extending Thread, start() is inherited and can be called directly
        by child class. start() method only calls run() method to execute while creating a new Thread
        If we call run() method directly, that will work like a normal method call and will be executed by main() Thread.
         */

        /* Multiple ways to create thread when extending */
        Thread newThread = new Thread(new CreateByExtending());
        newThread.start();
        CreateByExtending newCreate = new CreateByExtending();
        newCreate.start();

        /* Only way to create Thread when Implementing */
        Thread newThreadImp = new Thread(new CreateByImplementation());
        newThreadImp.start();

    }
}
