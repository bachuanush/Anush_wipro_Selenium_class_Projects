package Day9;

import java.util.*;

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

  
    public String getName() {
        return name;
    }

    
    public int compareTo(Employee other) {
        return this.name.compareToIgnoreCase(other.name); // Case-insensitive alphabetical order
    }

   
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}

public class Comparable_Employee {
	 public static void main(String[] args) {
	        
	        List<Employee> emps = new ArrayList<>();
	        emps.add(new Employee(101, "Abc", 70000));
	        emps.add(new Employee(102, "def", 65000));
	        emps.add(new Employee(103, "hij", 60000));
	        emps.add(new Employee(104, "klm", 75000));
      
	        Collections.sort(emps);

	        System.out.println("Employees sorted by name :");
	        for (Employee emp : emps) {
	            System.out.println(emp);
	        }
	    }
}
