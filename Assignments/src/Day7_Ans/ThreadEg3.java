package Day7_Ans;

class MessageThread extends Thread {
 String message;

 MessageThread(String msg) {
     this.message = msg;
 }

 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println(message);
     }
 }
}

public class ThreadEg3 {
 public static void main(String[] args) {
     MessageThread t1 = new MessageThread("Thread 1");
     MessageThread t2 = new MessageThread("Thread 2");
     t1.start();
     t2.start();
 }
}

