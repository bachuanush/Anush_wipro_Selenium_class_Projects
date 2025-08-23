package Day7_Ans;

class EvenPrinter extends Thread {
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}
class OddPrinter extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}
public class EvenOddThreads {
    public static void main(String[] args) {
        new EvenPrinter().start();
        new OddPrinter().start();
    }
}

