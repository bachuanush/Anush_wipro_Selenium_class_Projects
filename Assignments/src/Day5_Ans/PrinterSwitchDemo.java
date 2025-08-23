package Day5_Ans;

interface Printer {
 void print(String document);
}

class LaserPrinter implements Printer {
 @Override
 public void print(String document) {
     System.out.println("Laser printer: " + document);
 }
}

class InkjetPrinter implements Printer {
 @Override
 public void print(String document) {
     System.out.println("Inkjet printer: " + document);
 }
}

public class PrinterSwitchDemo {
 public static void main(String[] args) {
     Printer p;

     p = new LaserPrinter();
     p.print("annual report");

     p = new InkjetPrinter();
     p.print("color photo");
 }
}
