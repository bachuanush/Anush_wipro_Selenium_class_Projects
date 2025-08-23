package Day10_Ans;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ans6 {
    public static void main(String[] args) {
        int lines = 0, words = 0, chars = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines++;
                words += line.split("\s+").length;
                chars += line.length();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Characters: " + chars);
    }
}

