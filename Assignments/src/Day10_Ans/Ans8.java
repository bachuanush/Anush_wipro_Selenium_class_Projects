package Day10_Ans;

import java.io.File;

public class Ans8 {
    public static void main(String[] args) {
        File folder = new File(".");
        File[] list = folder.listFiles();
        if (list != null) {
            for (File f : list) {
                System.out.println(f.getName());
            }
        }
    }
}

