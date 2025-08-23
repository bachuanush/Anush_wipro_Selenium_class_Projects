package Day9;

import java.io.File;

public class FileProps {
    public static void main(String[] args) {
        File file = new File("report.txt");
        if (file.exists()) {
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("File Name: " + file.getName());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Size: " + file.length());
        } else {
            System.out.println("File does not exist");
        }
    }
}
