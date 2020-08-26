package filereader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("DemoTextFile");
		Scanner reader = new Scanner(file);
		while(reader.hasNextLine()) {
			String data = reader.nextLine();
			System.out.println(data);
		}
		
		/*
		 * System.out.println(file.canRead()); System.out.println(file.exists());
		 * file.createNewFile(); System.out.println(file.length()
		 * +" Name is: "+file.getName());
		 * System.out.println("Absolute path is: "+file.getAbsolutePath());
		 */

	}

}
