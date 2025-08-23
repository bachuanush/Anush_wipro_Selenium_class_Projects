package Day7_Ans;

class StoppableThread extends Thread {
    private volatile boolean running = true;

    public void stopThread() {
        running = false;
    }
    public void run() {
        while (running) {
            System.out.println("Thread is running");
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
        System.out.println("Thread stopped");
    }
}
public class StopThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        StoppableThread t = new StoppableThread();
        t.start();
        Thread.sleep(2000);
        t.stopThread();
    }
}
