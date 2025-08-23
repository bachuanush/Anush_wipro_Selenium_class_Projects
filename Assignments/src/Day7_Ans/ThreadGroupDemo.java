package Day7_Ans;

class MyThread4 extends Thread {
 MyThread4(ThreadGroup group, String name) {
     super(group, name);
 }

 @Override
 public void run() {
     System.out.println(getName() + " started");
     try {
         Thread.sleep(2000);
     } catch (Exception e) {
         System.out.println(getName() + " interrupted");
     }
     System.out.println(getName() + " finished");
 }
}

public class ThreadGroupDemo {
 public static void main(String[] args) throws InterruptedException {

     ThreadGroup group = new ThreadGroup("myThreadGroup");

     MyThread4 t1 = new MyThread4(group, "Thread-1");
     MyThread4 t2 = new MyThread4(group, "Thread-2");
     MyThread4 t3 = new MyThread4(group, "Thread-3");

     t1.start();
     t2.start();
     t3.start();

     System.out.println("active Thread Count: " + group.activeCount());
     System.out.println("thread Group name: " + group.getName());

     group.list();

     t1.join();
     t2.join();
     t3.join();

     System.out.println("all threads finished execution");
 }
}

