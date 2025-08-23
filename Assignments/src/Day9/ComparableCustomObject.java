package Day9;

import java.util.*;

class Employees implements Comparable<Employees> {
    private int empId;
    private String empName;
    private int empSalary;

    public Employees(int empId, String empName, int empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    @Override
    public int compareTo(Employees other) {
        return Integer.compare(this.empSalary, other.empSalary);
    }

    @Override
    public String toString() {
        return "Employees{id=" + empId + ", name='" + empName + "', salary=" + empSalary + "}";
    }
}

public class ComparableCustomObject {
    public static void main(String[] args) {

        List<Employees> employeeList = new ArrayList<Employees>();
        employeeList.add(new Employees(201, "Ravi", 75000));
        employeeList.add(new Employees(202, "Sneha", 88000));
        employeeList.add(new Employees(203, "Kiran", 67000));
        employeeList.add(new Employees(204, "Meera", 92000));

        System.out.println("Before Sorting:");
        for (Employees emp : employeeList) {
            System.out.println(emp);
        }

        Collections.sort(employeeList);

        System.out.println("\nAfter Sorting by Salary:");
        for (Employees emp : employeeList) {
            System.out.println(emp);
        }
    }
}
