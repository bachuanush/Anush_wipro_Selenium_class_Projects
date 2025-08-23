package Day7_Ans;


class IntWrapper {
    int value;

    IntWrapper(int value) {
        this.value = value;
    }
}

public class WrapperReference {
    static void incrementUsingWrapper(IntWrapper num) {
        num.value += 10;
    }

    static void incrementUsingArray(int[] arr) {
        arr[0] += 10; 
    }

    public static void main(String[] args) {
        // Using Wrapper Class
        IntWrapper number = new IntWrapper(20);
        System.out.println("Before (Wrapper): " + number.value);
        incrementUsingWrapper(number);
        System.out.println("After  (Wrapper): " + number.value);

        System.out.println();

        // Using Array
        int[] numArray = { 20 };
        System.out.println("Before (Array)  : " + numArray[0]);
        incrementUsingArray(numArray);
        System.out.println("After  (Array)  : " + numArray[0]);
    }
}
