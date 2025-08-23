package Practise;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serial_data1 {

	public static void main(String[] args) throws IOException{
		Employee em = new Employee(23, "Jagan");
		FileOutputStream fs = new FileOutputStream("Employee.class");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		
		os.writeObject(em);
		os.close();
		fs.close();
		System.out.println("Serialization Done!");

	}

}
