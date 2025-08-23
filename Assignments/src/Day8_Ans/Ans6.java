package Day8_Ans;

import java.util.ArrayList;

public class Ans6 {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();

        subjects.add("Math");
        subjects.add("Physics");
        subjects.add("Chemistry");
        subjects.add("Biology");
        subjects.add("English");

        System.out.println("Before Update: " + subjects);

        int index = subjects.indexOf("Math"); 
        if (index != -1) {
            subjects.set(index, "Statistics");
        } else {
            System.out.println("Subject not found");
        }

        System.out.println("After Update: " + subjects);
    }
}

