package Day10_Ans;

import java.io.File;
import java.io.FilenameFilter;

public class Ans9 {
    public static void main(String[] args) {
        File folder = new File(".");
        File[] txtFiles = folder.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        });
        for (File f : txtFiles) {
            System.out.println(f.getName());
        }
    }
}

