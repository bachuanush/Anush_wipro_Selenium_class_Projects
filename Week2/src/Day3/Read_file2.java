package Day3;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Read_file2 {

	public static void main(String[] args) throws IOException {
		List<String> lines = new ArrayList<String>();
		BufferedReader r = new BufferedReader(new FileReader("Sample.txt"));
		
		String l;
		
		while((l=r.readLine())!=null)
		{
			lines.add(l);
		}
		
		for(String l2:lines)
		{
			System.out.println(l2);
		}
		r.close();
	}

}


