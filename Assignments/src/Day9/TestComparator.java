package Day9;

import java.util.*;

class Student1 {
    int id;
    String name;
    Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString() {
        return id + " " + name;
    }
}
 
public class TestComparator implements Comparator<Student1> {
	public int compare(Student1 s1,Student1 s2)
		{
			return Integer.compare(s1.id,s2.id);
		}
    public static void main(String[] args) {
        List<Student1> list =new ArrayList<>();
 
        list.add(new Student1(0, "arjun"));
        list.add(new Student1(3,"vijay"));
        list.add(new Student1(1, "manas"));
        list.add(new Student1(2, "Kittu"));
        System.out.println(list);
        Collections.sort(list, new TestComparator());
 
        list.forEach(System.out::println);
    }
}

