package Practise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Day2.Arraylist;

public class Practise {

	public static void main(String[] args) throws IOException {
		//Creating a Text File
		
		File f = new File("Prac2.txt");
		try {
			f.createNewFile();
			System.out.println(f.setWritable(true));
		}
		catch (Exception e) {
			System.out.println("File not foun!");
			System.out.println(e);
		}
		
		//Writing content in the File
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Prac2.txt"));
			bw.write("Welcome");
			bw.newLine();
			bw.write("to");
			bw.newLine();
			bw.write("Prac2");
			bw.close();
			System.out.println("File write success!");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		//Read a File
		
		List<String> line = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader("Prac2.txt"));
		
		String ll;
		
		while((ll=br.readLine()) != null) {
			line.add(ll);
		}
		
		for(String l2:line) {
			System.out.println(l2);
		}
		
		br.close();

	}

}
