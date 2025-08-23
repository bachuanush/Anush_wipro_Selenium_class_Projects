package Day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class De_serial {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fos = new FileInputStream("Student.txt");
		ObjectInputStream oos = new ObjectInputStream(fos);
		Student s1 =(Student)oos.readObject();
		
		//oos.writeObject(s1)
		
		s1.display();
		oos.close();
		fos.close();
		
		System.out.println("DeSerialization done Sucessfully");
		
	}

}
