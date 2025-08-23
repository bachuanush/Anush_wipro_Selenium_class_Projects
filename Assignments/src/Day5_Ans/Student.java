package Day5_Ans;


public class Student {
    private String name;
    private int rollNumber;
    private int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            this.marks = 0; 
        }
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getMarks() {
        return marks;
    }

    public void displayDetails() {
        System.out.println("name: " + name);
        System.out.println("rolno: " + rollNumber);
        System.out.println("marks: " + marks);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Anush", 101, 85);
        student1.displayDetails();

        System.out.println("*******************");

        Student student2 = new Student("ravi", 102, 150);
        student2.displayDetails();
    }
}
