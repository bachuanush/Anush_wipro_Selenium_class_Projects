package Day3;

import java.io.File;

public class Io_FIle {

	public static void main(String[] args) {
//		File f = new File("C:\\Users\\shashank\\Desktop\\Anush\\Sample1.txt");
		File f = new File("Sample.txt");
		
		try {
			f.createNewFile(); //Create new File on Particular Location
			System.out.println(f.setWritable(true));
		}
		
		catch(Exception e) {
			System.out.println("File not Found");
			System.out.println(e);
		}

	}

}
