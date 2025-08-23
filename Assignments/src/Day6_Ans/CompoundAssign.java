package Day6_Ans;

public class CompoundAssign {
    public static void main(String[] args) {
        int x = 5;

        //x = x + 4.5;  // This line DOES NOT compile because:
        // The right-hand side expression (x + 4.5) results in a double,
        // and Java does not allow implicit narrowing from double to int.
        // So assigning a double to int directly without casting causes a compile-time error.

        // Instead, if you uncomment the below line, it causes compilation error:
        // x = x + 4.5;

        // Using compound assignment:
        x += 4.5;  
        // This compiles successfully because compound assignment operators
        // perform an implicit cast to the type of the left-hand variable.
        // Here, 4.5 (double) is implicitly cast to int during the addition,
        // so it is equivalent to x = (int)(x + 4.5);

        System.out.println("Result of x += 4.5: " + x);
        // Output: 9
        // Explanation: 5 + 4.5 = 9.5, but implicit cast to int truncates decimal part, so result is 9.
    }
}
