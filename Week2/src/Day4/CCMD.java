package Day4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CCMD {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("SampleDemo1.txt");
		
		//Create a File		
		Files.createFile(path);
		System.out.println("File created");
		
//		//Copy file
		Path copypath = Paths.get("Samplecopy.txt");
		Files.copy(path, copypath, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File Copied");
		
//		//Move File
		Path movedPath = Paths.get("movedfile.txt");
		Files.move(copypath, movedPath, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File moved");
		
//		//Delete file
		Files.deleteIfExists(path);
		Files.deleteIfExists(movedPath);
		System.out.println("Files deleted");

	}

}
