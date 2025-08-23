package Day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_file {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new FileReader("Sample.txt"));
		String line;
		
		if((line=r.readLine())!=null)
		{
			System.out.println(line);
		}
		else 
		{
			System.out.println("FIle is null");
		}
	}

}


