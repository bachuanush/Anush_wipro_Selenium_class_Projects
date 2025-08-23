package Day7_Ans;

class Printer {
    private boolean letterTurn = true;

    public synchronized void printLetter(char letter) {
        while (!letterTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(letter + " ");
        letterTurn = false;
        notify();
    }

    public synchronized void printNumber(int number) {
        while (letterTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(number + " ");
        letterTurn = true;
        notify();
    }
}

class LetterThread extends Thread {
    private Printer printer;

    public LetterThread(Printer printer) {
        this.printer = printer;
    }

    public void run() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            printer.printLetter(ch);
        }
    }
}

class NumberThread extends Thread {
    private Printer printer;

    public NumberThread(Printer printer) {
        this.printer = printer;
    }

    public void run() {
        for (int i = 1; i <= 26; i++) {
            printer.printNumber(i);
        }
    }
}

public class AlternatePrinting {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread t1 = new LetterThread(printer);
        Thread t2 = new NumberThread(printer);

        t1.start();
        t2.start();
    }
}

