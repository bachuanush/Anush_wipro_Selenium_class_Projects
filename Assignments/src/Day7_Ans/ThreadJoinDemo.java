package Day7_Ans;

class WorkerThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Worker: " + i);
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}
public class ThreadJoinDemo {
    public static void main(String[] args) {
        WorkerThread worker = new WorkerThread();
        worker.start();

        try {
            worker.join(); 
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Main thread");
    }
}
