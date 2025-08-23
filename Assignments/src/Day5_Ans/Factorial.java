package Day5_Ans;

import java.util.function.IntFunction;

public class Factorial {
    public static void main(String[] args) {
        IntFunction<Long> factorial = n -> {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println("Factorial of 5: " + factorial.apply(5));  // 120
        System.out.println("Factorial of 7: " + factorial.apply(7));  // 5040
    }
}

