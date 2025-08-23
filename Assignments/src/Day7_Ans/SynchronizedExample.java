package Day7_Ans;


class Counter1 {
 private int count = 0;

 public synchronized void increment() {
     count++;
 }

 public int getCount() {
     return count;
 }
}

class MyThread extends Thread {
 Counter1 counter;

 MyThread(Counter1 counter) {
     this.counter = counter;
 }

 public void run() {
     for (int i = 0; i < 1000; i++) {
         counter.increment();
     }
 }
}

public class SynchronizedExample {
 public static void main(String[] args) throws InterruptedException {
     Counter1 coun = new Counter1();

     MyThread t1 = new MyThread(coun);
     MyThread t2 = new MyThread(coun);

     t1.start();
     t2.start();

     t1.join();
     t2.join();

     System.out.println("fnl count: " + coun.getCount());
 }
}

