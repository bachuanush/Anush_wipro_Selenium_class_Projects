package Day3;

//File 1 continue to...........
//This File 2.


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Serializable2_conti {

	public static void main(String[] args) {
		Serializer_demo empDemo = new Serializer_demo(101, "Minisha shah");
		
		try {
			FileWriter fw = new FileWriter("employee.txt");
			BufferedWriter b = new BufferedWriter(fw);
			b.write(empDemo.toString());
			b.newLine();
			b.close();
			System.out.println("Done");
		} catch (IOException e) {
			System.out.println("Failed");
			System.out.println(e);
		}

	}

}
