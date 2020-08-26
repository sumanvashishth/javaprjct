package filereader;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fout = new FileOutputStream("DemoTextFile");
		String s = "Summi";
		byte b[] = s.getBytes();
		fout.write(b);
		
		/*
		 * FileWriter writer = new FileWriter("DemoTextFile"); String str = "Hi Suman" ;
		 * writer.append(str); writer.close();
		 */
	}

}
