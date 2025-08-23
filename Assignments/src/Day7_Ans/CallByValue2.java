package Day7_Ans;

class Student2 {
    String name;
    int marks;

    Student2(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}

public class CallByValue2 {

    static void changeObjectReference(Student2 s) {
        s = new Student2("NewStudent", 100);
        System.out.println("Inside changeObjectReference:");
        s.display();  
 }

    static void modifyObjectState(Student2 s) {
        s.marks = 999;
        System.out.println("Inside modifyObjectState:");
        s.display(); 
    }

    public static void main(String[] args) {
        Student2 stu = new Student2("OriginalStudent", 50);

        System.out.println("Before changeObjectReference:");
        stu.display();

        changeObjectReference(stu); 

        System.out.println("After changeObjectReference:");
        stu.display();  

        modifyObjectState(stu);  

        System.out.println("After modifyObjectState:");
        stu.display(); 
    }
}
