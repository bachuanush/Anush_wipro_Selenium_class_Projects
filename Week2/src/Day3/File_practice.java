package Day3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class File_practice {

	public static void main(String[] args) throws IOException{
		File fl = new File("Practise.txt");
		
		try {
			fl.createNewFile();
			System.out.println(fl.setWritable(true));
		}
		catch (Exception e) {
			System.out.println("File not FOund");
			System.out.println(e);
		}
		

		
		try {
			BufferedWriter wr = new BufferedWriter(new FileWriter("Practise.txt"));
			wr.write("Practising File Handling");
			wr.newLine();
			wr.write("Java");
			wr.newLine();
			wr.write("30/07/2025");
			wr.close();
			System.out.println("Done Writing into File!");
		}
		catch (Exception e) {
			e.printStackTrace();
		}


		
		if(fl.exists()) {
			System.out.println("File name :" + fl.getName());
			System.out.println("File path :" + fl.getAbsolutePath());
			
			System.out.println("File can read :" + fl.canRead());
			System.out.println("File can write :" + fl.canWrite());
		}
		else {
			System.out.println("File not Found!");
		}
		

		List<String> lns = new ArrayList<String>();
		BufferedReader r1 = new BufferedReader(new FileReader("Practise.txt"));
		
		String ln;
		
		while((ln = r1.readLine())!=null)
		{
			System.out.println(ln);
		}
		
		for(String l3 : lns) {
			System.out.println(l3);
		}
		
		r1.close();
		
		
	}

}
