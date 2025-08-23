package Day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write_file {

	public static void main(String[] args) {
		try {
			BufferedWriter w = new BufferedWriter(new FileWriter("Prac.txt"));
			w.write("hello");
			w.newLine();
			w.write("Welcome to Java Learning sessions");
			w.close();
			System.out.println("Write file Sucessfully");
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}


