package Day7_Ans;

class MyThread1 extends Thread {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println(i);
     }
 }
}

public class ThreadEg1 {
 public static void main(String[] args) {
     MyThread1 t1 = new MyThread1();
     t1.start();
 }
}

