package Day7_Ans;

class Counter {
    int count = 0;
}
class CounterThread extends Thread {
    Counter counter;
    CounterThread(Counter counter) {
        this.counter = counter;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.count++; 
        }
    }
}
public class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        CounterThread t1 = new CounterThread(counter);
        CounterThread t2 = new CounterThread(counter);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("final count: " + counter.count);
    }
}

