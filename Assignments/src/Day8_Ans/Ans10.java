package Day8_Ans;

import java.util.ArrayList;

public class Ans10 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        list1.add("Mango");

        ArrayList<String> list2 = new ArrayList<>();

        list2.addAll(list1);

        System.out.println("First List: " + list1);
        System.out.println("Second List (copied): " + list2);
    }
}

