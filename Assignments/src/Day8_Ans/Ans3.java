package Day8_Ans;

import java.util.ArrayList;
import java.util.Scanner;
public class Ans3 {
public static void main(String[] args) {
ArrayList<String> fruits = new ArrayList<>();
fruits.add("Grapes");
fruits.add("Apple");
fruits.add("Orange");
fruits.add("Mango");
fruits.add("Banana");
System.out.println("Original Fruit List: " + fruits);
Scanner scanner = new Scanner(System.in);

System.out.print("Enter fruit name to remove: ");
String Removefruit = scanner.nextLine();

if (fruits.remove(Removefruit)) {
System.out.println(Removefruit + " removed successfully");
} else {
System.out.println(Removefruit + " not found in the list");
}
System.out.println("Updated Fruit List: " + fruits);
scanner.close();
}
}