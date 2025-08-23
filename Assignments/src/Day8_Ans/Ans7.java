package Day8_Ans;

import java.util.ArrayList;

public class Ans7 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Before clear(): " + numbers);

        numbers.clear();

        System.out.println("After clear(): " + numbers);

        System.out.println("Size of list: " + numbers.size());
    }
}

