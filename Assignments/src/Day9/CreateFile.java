package Day9;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("student.txt")) {
            fw.write("Ravi");
            fw.write("Anush");
            fw.write("Kiran");
            fw.write("Priya");
            fw.write("Meena");
            System.out.println("File createdata written successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

