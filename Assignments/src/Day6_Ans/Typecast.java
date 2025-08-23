package Day6_Ans;

import java.util.Scanner;

public class Typecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter an int value: ");
        int intValue = scanner.nextInt();

        double doubleValue = intValue;

        System.out.println("int value: " + intValue);
        System.out.println("double value: " + doubleValue);

        System.out.print("enter a double value: ");
        double inputDouble = scanner.nextDouble();

        int castedInt = (int) inputDouble;

        short castedShort = (short) castedInt;

        System.out.println("original value: " + inputDouble);
        System.out.println("after casting to int: " + castedInt);
        System.out.println("after casting int to short: " + castedShort);

    }
}

