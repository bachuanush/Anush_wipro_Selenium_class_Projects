package Day7_Ans;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class TimePrinter extends Thread {
    public void run() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        while (true) {
            System.out.println("current Time: " + LocalTime.now().format(formatter));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("daemon thread");
            }
        }
    }
}

public class DaemonThread {
    public static void main(String[] args) {
        TimePrinter daemonThread = new TimePrinter();
        daemonThread.setDaemon(true);
        daemonThread.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("main thread working" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("main thread finished");
    }
}

