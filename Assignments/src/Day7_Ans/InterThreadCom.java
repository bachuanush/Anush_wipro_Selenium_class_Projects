package Day7_Ans;


class SharedResource1 {
 private boolean ready = false;

 public synchronized void waitUntilReady() {
     while (!ready) {  
         try {
             System.out.println(Thread.currentThread().getName() + " is waiting");
             wait(); 
         } catch (InterruptedException e) {
             Thread.currentThread().interrupt();
         }
     }
     System.out.println(Thread.currentThread().getName() + " proceeding");
 }

 public synchronized void setReady() {
     ready = true;
     System.out.println(Thread.currentThread().getName() + " notifying all");
     notifyAll();
 }
}

public class InterThreadCom {
 public static void main(String[] args) {
     SharedResource1 resource = new SharedResource1();

     for (int i = 1; i <= 3; i++) {
         Thread t = new Thread(resource::waitUntilReady, "worker-" + i);
         t.start();
     }

     Thread notifier = new Thread(() -> {
         try {
             Thread.sleep(2000);
         } catch (InterruptedException e) {
             Thread.currentThread().interrupt();
         }
         resource.setReady();
     }, "notifier");

     notifier.start();
 }
}

