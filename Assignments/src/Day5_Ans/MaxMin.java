package Day5_Ans;

@FunctionalInterface
interface TwoNumberOperation {
 int operate(int a, int b);
}

public class MaxMin {
 public static void main(String[] args) {
     TwoNumberOperation max = (a, b) -> (a > b) ? a : b;
     TwoNumberOperation min = (a, b) -> (a < b) ? a : b;

     System.out.println("Max of 10 and 20: " + max.operate(10, 20));
     System.out.println("Min of 10 and 20: " + min.operate(10, 20));
 }
}

