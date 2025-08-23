package Day5_Ans;

import java.util.function.Function;

public class UpperCase {
    public static void main(String[] args) {
        Function<String, String> toUpperCase = s -> s.toUpperCase();
        String original = "hello world";
        String upper = toUpperCase.apply(original);
        System.out.println("Original: " + original);
        System.out.println("Uppercase: " + upper);
    }
}
