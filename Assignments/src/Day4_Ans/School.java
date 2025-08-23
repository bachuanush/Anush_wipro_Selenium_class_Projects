package Day4_Ans;



abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void getRoleInfo();
}

class Student extends Person {
    String course;
    int rollNumber;

    Student(String name, int age, String course, int rollNumber) {
        super(name, age);
        this.course = course;
        this.rollNumber = rollNumber;
    }

    @Override
    void getRoleInfo() {
        System.out.println("student name: " + name);
        System.out.println("age: " + age);
        System.out.println("course: " + course);
        System.out.println("rollno: " + rollNumber);
    }
}

class Professor extends Person {
    String subject;
    double salary;

    Professor(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    void getRoleInfo() {
        System.out.println("professor name: " + name);
        System.out.println("age: " + age);
        System.out.println("sub: " + subject);
        System.out.println("sal: " + salary);
    }
}

class TeachingAssistant extends Student {

    TeachingAssistant(String name, int age, String course, int rollNumber) {
        super(name, age, course, rollNumber);
    }

    @Override
    void getRoleInfo() {
        System.out.println("teaching assistant Nnme: " + name);
        System.out.println("age: " + age);
        System.out.println("course: " + course);
        System.out.println("rollno: " + rollNumber);
        System.out.println("role: Both student and assistant");
    }
}

public class School {
    public static void main(String[] args) {
        Student s = new Student("Anush", 22, "c.s", 101);
        Professor p = new Professor("Dr. rao", 45, "e.c.e", 90000);
        TeachingAssistant ta = new TeachingAssistant("kiran", 24, "m.l", 102);

        s.getRoleInfo();
        System.out.println("***********************");
        p.getRoleInfo();
        System.out.println("***********************");
        ta.getRoleInfo();
    }
}
