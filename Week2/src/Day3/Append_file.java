package Day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Append_file {

	public static void main(String[] args) {
		try {
			BufferedWriter w = new BufferedWriter(new FileWriter("Sample.txt", true));
			w.write("\nHello");
			w.newLine();
			w.write("\nWelcome to JAva Learning sessions");
			w.close();
			System.out.println("write file sucessfully");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
