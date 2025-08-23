package Day10_Ans;

import java.io.FileWriter;
import java.io.IOException;

public class Ans3 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("test.txt")) {
            writer.write("Hello, World!");
            System.out.println("Data to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
