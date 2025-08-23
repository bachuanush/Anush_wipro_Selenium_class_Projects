package Day9;

import java.time.LocalDate;
import java.util.*;


class Employe {
    private int id;
    private String name;
    private LocalDate joiningDate;

   
    public Employe(int id, String name, LocalDate joiningDate) {
        this.id = id;
        this.name = name;
        this.joiningDate = joiningDate;
    }

  
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }
    
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', joiningDate=" + joiningDate + "}";
    }
}
public class Com_Emp {
	public static void main(String[] args) {
   
        List<Employe> emp = new ArrayList<>();
        emp.add(new Employe(101, "vijju", LocalDate.of(2025, 5, 10)));
        emp.add(new Employe(102, "harish", LocalDate.of(2025, 7, 15)));
        emp.add(new Employe(103, "nisha", LocalDate.of(2025, 9, 1)));
        emp.add(new Employe(104, "raj", LocalDate.of(2025, 1, 20)));

       
        System.out.println("Before Sorting by Joining Date:");
        emp.forEach(System.out::println);


        emp.sort(Comparator.comparing(Employe::getJoiningDate));

        System.out.println("************************************");
        
        System.out.println("After Sorting by Joining Date (Earliest First):");
        emp.forEach(System.out::println);
    }
}


