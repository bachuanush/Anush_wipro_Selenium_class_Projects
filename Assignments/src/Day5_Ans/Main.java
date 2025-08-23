package Day5_Ans;

interface BaseVehicle {
 void start();
}

interface AdvancedVehicle extends BaseVehicle {
 void stop();
 boolean refuel(int amount);
}

class Car implements AdvancedVehicle {
 private int fuelLevel;

 public Car(int fuelLevel) {
     this.fuelLevel = fuelLevel;
 }

 @Override
 public void start() {
     if (fuelLevel > 0) {
         System.out.println("car started fuel level: " + fuelLevel);
     } else {
         System.out.println("cannot start fuel is empty");
     }
 }

 @Override
 public void stop() {
     System.out.println("car stopped");
 }

 @Override
 public boolean refuel(int amount) {
     if (amount > 0) {
         fuelLevel += amount;
         System.out.println("refueled " + amount + " unit current fuel: " + fuelLevel);
         return true;
     }
     System.out.println("refuel amount should positive");
     return false;
 }
}
public class Main {
 public static void main(String[] args) {
     BaseVehicle baseRef = new Car(5);
     baseRef.start();

     System.out.println();

     AdvancedVehicle advRef = new Car(0);
     advRef.start(); 
     advRef.refuel(10);
     advRef.start();
     advRef.stop();
 }
}

