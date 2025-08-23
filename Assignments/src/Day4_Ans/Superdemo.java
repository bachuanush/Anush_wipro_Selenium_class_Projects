package Day4_Ans;

class Vehicle1 {
 String brand = "Generic Vehicle";
 Vehicle1() {
     System.out.println("Vehicle constructor called");
 }
 void displayInfo() {
     System.out.println("This is a vehicle");
 }
}

class Car extends Vehicle1 {
 String brand = "Car Brand";

 Car() {
     super(); 
     System.out.println("Car constructor called");
 }

 void displayInfo() {
     super.displayInfo(); 
     System.out.println("This is a car");
 }

 void showBrandNames() {
     System.out.println("Child brand: " + brand);
     System.out.println("Parent brand: " + super.brand); 
 }
}

public class Superdemo {
 public static void main(String[] args) {
     Car myCar = new Car();
     myCar.displayInfo();
     myCar.showBrandNames();
 }
}
