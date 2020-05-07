package MultithreadingBasics.ThreadSignalling;

public class main {
    public static void main(String[] args) throws InterruptedException {

        MonitorObject monitorObject = new MonitorObject();

        // Threads waiting

        new Thread(
                () -> {
                    try {
                        monitorObject.customWait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        ).start();

        new Thread(
                () -> {
                    try {
                        monitorObject.customWait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        ).start();

        new Thread(
                () -> {
                    try {
                        monitorObject.customWait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        ).start();

        new Thread(
                () -> {
                    monitorObject.customNotify();
                }
        ).start();
    }
}
