package Day6_Ans;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultiExceptionDemo {
    public static void main(String[] args) {
        String filename = "numbers.txt"; 

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            String firstLine = br.readLine();
            int number = Integer.parseInt(firstLine);

            int result = 100 / number;

            System.out.println("Result: " + result);
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Problem reading file");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } finally {
            System.out.println("Execution completed");
        }
    }
}
