package MultithreadingBasics.SynchronizationHell;

public class main {
    public static void main(String[] args) throws Exception{

        //Monitor Object
        TypesOfSynchronizedBlocks typesOfSynchronizedBlocks = new TypesOfSynchronizedBlocks();

        // Anonymous Thread Class to start new threads.
        new Thread(
                () -> {
                    try {
                        typesOfSynchronizedBlocks.synchronizedBlock();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        ).start();
        new Thread(
                () -> {
                    try {
                        typesOfSynchronizedBlocks.synchronizedBlock();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        ).start();

        new Thread(
                () -> {
                    try {
                        typesOfSynchronizedBlocks.synchronizedMethod();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        ).start();

        new Thread(
                () -> {
                    try {
                        typesOfSynchronizedBlocks.synchronizedMethod();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        ).start();


        new Thread(
                () -> {
                    try {
                        TypesOfSynchronizedBlocks.staticSynchronizedBlock();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        ).start();

        new Thread(
                () -> {
                    try {
                        TypesOfSynchronizedBlocks.staticSynchronizedBlock();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        ).start();

        new Thread(
                () -> {
                    try {
                        TypesOfSynchronizedBlocks.staticSynchronizedMethod();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        ).start();

        new Thread(
                () -> {
                    try {
                        TypesOfSynchronizedBlocks.staticSynchronizedMethod();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        ).start();
    }


}
