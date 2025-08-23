package Day6_Ans;

public class OddChecker {
    public static class OddNumberException extends Exception {
        public OddNumberException(String message) {
            super(message);
        }
    }
    public static void checkOdd(int n) throws OddNumberException {
        if (n % 2 != 0) {
            throw new OddNumberException("Odd number: " + n);
        }
    }

    public static void main(String[] args) {
        int[] testNumbers = {2, 3, 4, 7, 10};

        for (int num : testNumbers) {
            try {
                checkOdd(num);
                System.out.println(num + " is even.");
            } catch (OddNumberException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
