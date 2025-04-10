package filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		FileWriter fw=new FileWriter("D://Others//Suraj.txt");
		
		System.out.println("Enter the content: ");
		String str=sc.nextLine();
		fw.write(str);
		System.out.println("File Wrote Successfully.");
		
		fw.close();
	}

}
