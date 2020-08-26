package BufferReader;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Reading data from a file
		try {
		InputStream inn = new BufferedInputStream(new FileInputStream("NewFile1"));
		int i;
		System.out.println("Now reading from file: ");
		while((i=inn.read())!=-1) {
			System.out.print((char)i);
		}
		inn.close();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("Hello");
	}

}
