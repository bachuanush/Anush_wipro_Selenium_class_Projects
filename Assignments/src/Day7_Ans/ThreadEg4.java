package Day7_Ans;


class SleepThread extends Thread {
 public void run() {
     try {
         for (int i = 1; i <= 3; i++) {
             System.out.println(i);
             Thread.sleep(1000); 
         }
     } catch (InterruptedException e) {
         System.out.println(e);
     }
 }
}

public class ThreadEg4 {
 public static void main(String[] args) {
     SleepThread t1 = new SleepThread();
     t1.start();
 }
}

