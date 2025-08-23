package Day5_Ans;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Operations {
    public static void main(String[] args) {
        double[] numbers = {3.5, 7.2, 1.8, 9.0, 4.4};

        double sum = Arrays.stream(numbers).sum();
        OptionalDouble max = Arrays.stream(numbers).max();

        OptionalDouble average = Arrays.stream(numbers).average();

        System.out.println("sum: " + sum);
        if (max.isPresent()) {
            System.out.println("max: " + max.getAsDouble());
        }
        if (average.isPresent()) {
            System.out.println("avg: " + average.getAsDouble());
        }
    }
}

