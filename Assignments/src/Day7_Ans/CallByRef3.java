package Day7_Ans;

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("name: " + name + ", marks: " + marks);
    }
}

public class CallByRef3 {

    public static void updateMarks(Student s, int newMarks) {
        s.marks = newMarks;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Anush", 75);

        System.out.println("before update:");
        student1.display();

        updateMarks(student1, 90);

        System.out.println("after update:");
        student1.display();
    }
}

