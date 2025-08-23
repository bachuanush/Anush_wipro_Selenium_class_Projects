package Day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Read_doc {
	public static void main(String[] args) throws IOException {
		List<String> lines = new ArrayList<String>();
		FileInputStream r = new FileInputStream("C:\\Users\\shashank\\Desktop\\Anush\\MCQ_WEEK1_Bachu_Anush.docx");
		
		int line;
		while((line=r.read())!=-1)
		{
			System.out.println((char)line);
		}
		
		for(String l:lines) {
			System.out.print(l);
		}
	}

}
