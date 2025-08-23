package Day10_Ans;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ans7 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("test.txt");
             FileWriter fw = new FileWriter("copy.txt")) {
            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
            System.out.println("File copied successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

