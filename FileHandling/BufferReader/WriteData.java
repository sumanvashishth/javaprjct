package BufferReader;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class WriteData {
/*
 * Is more efficient than file reader 
 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutputStream bfr = new BufferedOutputStream(new FileOutputStream("NewFile"));
		// Writing data to a file
		String s = "Learning File Handling";
		byte b[] = s.getBytes();
		bfr.write(b);
		bfr.close();
		bfr.flush();
		System.out.println("Success..");

	}

}
