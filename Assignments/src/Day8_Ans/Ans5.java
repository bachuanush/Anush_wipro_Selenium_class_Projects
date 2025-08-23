package Day8_Ans;



import java.util.ArrayList;
import java.util.Collections;

public class Ans5 {
    public static void main(String[] args) {
        ArrayList<Character> charList = new ArrayList<>();
        charList.add('A');
        charList.add('B');
        charList.add('C');
        charList.add('D');
        charList.add('E');

        System.out.println("Original List: " + charList);

        Collections.reverse(charList);

        System.out.println("Reversed List: " + charList);
    }
}