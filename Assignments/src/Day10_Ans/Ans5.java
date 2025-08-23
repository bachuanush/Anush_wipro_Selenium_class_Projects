package Day10_Ans;

import java.io.FileWriter;
import java.io.IOException;

public class Ans5 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("test.txt", true)) {
            writer.write("fygjuyogr");
            System.out.println("Text append");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
