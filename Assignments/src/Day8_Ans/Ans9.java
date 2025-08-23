package Day8_Ans;

import java.util.ArrayList;


class Student {
private int id;
private String name;
private double marks;
public Student(int id, String name, double marks) {
this.id = id;
this.name = name;
this.marks = marks;
}
public int getId() { return id; }
public String getName() { return name; }
public double getMarks() { return marks; }
@Override
public String toString() {
return "Student [ID=" + id + ", Name=" + name + ", Marks=" + marks + "]";
}
}
public class Ans9 {
public static void main(String[] args) {
ArrayList<Student> students = new ArrayList<>();
students.add(new Student(101, "raj", 81.5));
students.add(new Student(102, "viajy", 72.0));
students.add(new Student(103, "rakesh", 78.3));
System.out.println("Student Details:");
for (Student student : students) {
System.out.println(student);
}
}
}