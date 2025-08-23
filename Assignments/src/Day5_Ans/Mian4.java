package Day5_Ans;

@FunctionalInterface
interface SumCalculator {
    int sum(int a, int b);
}
public class Mian4 {
    public static void main(String[] args) {
        SumCalculator calculator = (a, b) -> a + b;

        System.out.println("Sum: " + calculator.sum(15, 25));
    }
}
