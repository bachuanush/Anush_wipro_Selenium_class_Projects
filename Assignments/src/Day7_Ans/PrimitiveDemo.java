package Day7_Ans;

class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
}

public class PrimitiveDemo {
    public static void main(String[] args) {
        
        // Primitive type
        int num = 10;
        System.out.println("Primitive before: " + num);
        changePrimitive(num);
        System.out.println("Primitive after: " + num);
        
        System.out.println("********************");
        
        //  Non-primitive type (modify state)
        Person p1 = new Person("Alice");
        System.out.println("Object before: " + p1.name);
        changeObjectState(p1);
        System.out.println("Object after: " + p1.name); 
        
        System.out.println("********************");
        
        //  Non-primitive type (assign new object)
        Person p2 = new Person("Alice");
        System.out.println("Reference before: " + p2.name);
        assignNewObject(p2);
        System.out.println("Reference after: " + p2.name); 
    }
    
    static void changePrimitive(int x) {
        x = 20; 
    }
    
    static void changeObjectState(Person person) {
        person.name = "Bob"; 
    }
    
    static void assignNewObject(Person person) {
        person = new Person("Charlie"); 
    }
}
