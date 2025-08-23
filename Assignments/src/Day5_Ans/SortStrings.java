package Day5_Ans;

import java.util.*;

public class SortStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("kiwi","pear", "banana", "strawberry", "apple");
        words.sort((s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted alphabetically: " + words);
    }
}

