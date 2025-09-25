//package Day3;
//
//
//
//
//import java.util.*;
// 
//class Student1 {
//    int id;
//    String name;
//    Student1(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//    public String toString() {
//        return id + " " + name;
//    }
//}
// 
//public class Compartor2  implements Comparator<Student1> {
//	public int compare(Student1 s1,Student1 s2)
//		{
//			return Integer.compare(s1.id,s2.id);
//		}
//    public static void main(String[] args) {
//        List<Student1> list =new ArrayList<>();
// 
//        list.add(new Student1(0, "Amit"));
//        
//        list.add(new Student1(1, "Rahul"));
//        list.add(new Student1(2, "Kiran"));
//        Collections.sort(list, new Compartor2 ());
//     //   list.sort((s1, s2) -> s1.name.compareTo(s2.name));  // use comparator
// 
//        list.forEach(System.out::println);
//    }
//}
// 
// 