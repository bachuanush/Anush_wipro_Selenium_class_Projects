package Day4_Ans;

class Vehicles {
 Vehicles() {
     System.out.println("Vehicle Created");
 }

 void run() {
     System.out.println("Vehicle is running...");
 }
}

class Bike extends Vehicles {
 Bike() {
     super();
     System.out.println("Bike Created");
 }

 @Override
 void run() {
     System.out.println("Bike running");
 }
}

public class PolyDemo {
 public static void main(String[] args) {
     Vehicles obj = new Bike(); 
     obj.run();
 }
}
