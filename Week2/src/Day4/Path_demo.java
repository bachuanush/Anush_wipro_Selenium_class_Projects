package Day4;
//Craeting a new File, adding contents into it, copyo
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Path_demo {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("Sample21.txt");
		
		Files.createFile(path);
		System.out.println("File created");
		
		try {
			BufferedWriter br= new BufferedWriter(new FileWriter("Sample21.txt"));
			br.write("Creating a file");
			br.newLine();
			br.write("Writing content into it");
			br.newLine();
			br.write("Copying that file");
			br.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//Copy file
		Path copypath = Paths.get("Samplecopy.txt");
		Files.copy(path, copypath, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File Copied!");
	}
}
