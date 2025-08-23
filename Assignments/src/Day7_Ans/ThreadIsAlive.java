package Day7_Ans;

class MyThread3 extends Thread {
    public void run() {
        System.out.println(getName() + " is running");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " has finished");
    }
}

public class ThreadIsAlive {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3();
        
        System.out.println("before starting: t1 is alive? " + t1.isAlive());
        
        t1.start();
        
        System.out.println("after starting: t1 is alive? " + t1.isAlive());
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("while running: t1 is alive? " + t1.isAlive());
        
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("after completion: t1 is alive? " + t1.isAlive());
    }
}

