package Day6_Ans;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed!");
        } finally {
            System.out.println("Operation completed.");
        }


        try {
            int[] arr = {1, 2, 3};
            int value = arr[5];  
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds");
        } finally {
            System.out.println("Operation completed.");
        }
    }
}

