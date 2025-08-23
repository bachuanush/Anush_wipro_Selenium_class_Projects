package Day7_Ans;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("animal name: " + name);
    }
}

public class ReferenceT {

    static void assignNewAnimal(Animal a) {
        a = new Animal("lion");  
        System.out.println("inside method:");
        a.display(); 
    }

    public static void main(String[] args) {
        Animal originalAnimal = new Animal("dog");

        System.out.println("before method call:");
        originalAnimal.display();  

        assignNewAnimal(originalAnimal);  
        System.out.println("after method call:");
        originalAnimal.display();
    }
}
