package Day3;

import java.io.File;

public class Existing_File {

	public static void main(String[] args) {

		File f = new File("Sample.txt");
		
		if(f.exists())
		{
			System.out.println("File name : " + f.getName());
			System.out.println("File Location : " + f.getAbsolutePath());
			System.out.println("File length : " + f.length());
			
			System.out.println("File readable : " + f.canRead());
			System.out.println("File writable : " + f.canWrite());
		}
		else {
			System.out.println("File not found");
		}

	}

}
