package Day7_Ans;

class MyPriorityThread extends Thread {
    MyPriorityThread(String name) {
        super(name);
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - " + i);
        }
    }
}
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        MyPriorityThread t1 = new MyPriorityThread("Low Priority");
        MyPriorityThread t2 = new MyPriorityThread("Medium Priority");
        MyPriorityThread t3 = new MyPriorityThread("High Priority");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}

