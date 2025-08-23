package Day5_Ans;

import java.util.function.Predicate;

public class Empty {
    public static void main(String[] args) {
        Predicate<String> isEmpty = s -> s.isEmpty();

        System.out.println(isEmpty.test(""));     
        System.out.println(isEmpty.test("Hello")); 
        System.out.println(isEmpty.test(" "));    
}
}
