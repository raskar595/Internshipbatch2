package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int flag=1;
		
		while(flag!=0) {
			
			System.out.println("1.Create File");
			System.out.println("2.Write File");
			System.out.println("3.Read File");
			System.out.println("4.Delete File");
			System.out.println("5.Exit");
			
			System.out.println("Enter your choice: ");
			int choice=sc.nextInt();
			
			switch (choice) {
			case 1: {
				
				System.out.println("Enter the name to Create File: ");
				String name=sc.next();
				File file=new File("D://Others//"+name+".txt");
				
				if(file.exists()) {
					System.out.println("File Already Exists...!");
				}
				else {
					file.createNewFile();
					System.out.println("File created Successfully.");
				}
				
				break;
			}
			case 2: {
				System.out.println("Suraj.txt");
				System.out.println("Omkar.txt");
				System.out.println("Shriniwas");
				System.out.println("Enter the name to Write File: ");
				String name=sc.next();
				FileWriter fw=new FileWriter("D://Others//"+name+".txt");
				System.out.println("Enter the content: ");
				sc.nextLine();
				String content=sc.nextLine();
				fw.write(content);
				fw.close();
				System.out.println("Content Wrote Successfullly.");
				
				break;
			}
			case 3: {
				System.out.println("Suraj.txt");
				System.out.println("Omkar.txt");
				System.out.println("Shriniwas");
				System.out.println("Enter the name to Read File: ");
				String name=sc.next();
				FileReader fr=new FileReader("D://Others//"+name+".txt");
				
				int i;
				
				while((i=fr.read())!=-1) {
					System.out.print((char)i);
				}
				
				break;
			}
			case 4: {
				
				System.out.println("Enter the name to Delete File: ");
				String name=sc.next();
				File file=new File("D://Others//"+name+".txt");
				file.delete();
				System.err.println("File Deleted Successfully..");
			
				
				break;
			}
			case 5: {
				flag=0;
				
				continue;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			System.out.println("Do you want to continue...yes...or...no");
			String str=sc.next();
			if(str.equals("yes")) {
				
			}
			else {
				flag=0;
			}
		}
		
		System.err.println("Application has been closed...!");

	}

}
