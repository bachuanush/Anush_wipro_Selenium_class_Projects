package Day6_Ans;

class Animal {
 public void makeSound() {
     System.out.println("animal sound");
 }
}

class Dog extends Animal {
 @Override
 public void makeSound() {
     System.out.println("Woof!");
 }
 
 public void fetch() {
     System.out.println("fetch");
 }
}

public class Inherit {
 public static void main(String[] args) {
     Dog d = new Dog();  
     Animal a = d;        
     
     a.makeSound();       
 }
}
