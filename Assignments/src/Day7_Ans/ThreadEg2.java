package Day7_Ans;

class MyRunnable implements Runnable {
 public void run() {
     System.out.println("Current Thread: " + Thread.currentThread().getName());
 }
}

public class ThreadEg2 {
 public static void main(String[] args) {
     Thread t1 = new Thread(new MyRunnable());
     t1.start();
 }
}
