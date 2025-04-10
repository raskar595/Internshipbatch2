package filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreate {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("D://Others//Suraj.txt");
		
		if(file.exists()) {
			System.out.println("File Already Exists...!");
		}
		else {
			file.createNewFile();
			System.out.println("File created Successfully.");
		}
		
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
//		System.out.println(file.delete());
		
	}

}
