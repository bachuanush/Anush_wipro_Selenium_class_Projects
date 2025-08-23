package Day7_Ans;

class SharedResource {
 void printTable(int n) {
     synchronized (this) {
         for (int i = 1; i <= 5; i++) {
             System.out.println(Thread.currentThread().getName() + " : " + (n * i));
             try {
                 Thread.sleep(500);
             } catch (InterruptedException e) {
                 System.out.println(e);
             }
         }
     }
 }
}

class MyThread2 extends Thread {
 SharedResource resource;
 int number;

 MyThread2(SharedResource resource, int number, String name) {
     super(name);
     this.resource = resource;
     this.number = number;
 }

 public void run() {
     resource.printTable(number);
 }
}

public class SynchronizedBlock2 {
 public static void main(String[] args) {
     SharedResource obj = new SharedResource();

     MyThread2 t1 = new MyThread2(obj, 5, "Thread-1");
     MyThread2 t2 = new MyThread2(obj, 10, "Thread-2");

     t1.start();
     t2.start();
 }
}

