package Day9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Counting {
    public static void main(String[] args) {
        int lines = 0, words = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("student.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines++;
                words += line.split("\\s+").length;
            }
            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

