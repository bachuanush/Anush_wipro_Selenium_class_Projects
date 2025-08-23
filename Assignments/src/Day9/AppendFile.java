package Day9;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("student.txt", true)) {
            fw.write("\nSuresh");
            System.out.println("Data appende");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
