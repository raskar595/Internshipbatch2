package filehandling;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr=new FileReader("D://Others//Suraj.txt");
		
		int i;
		
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
	}

}
