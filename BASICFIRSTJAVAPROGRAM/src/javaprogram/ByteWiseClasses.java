package javaprogram;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ByteWiseClasses {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

//		// source :keyword , destination : console 
//		DataInputStream dis = new DataInputStream(System.in);
//		PrintStream ps = System.out;
//		ps.println("Enter the data");
//		String info = dis.readLine();
//		ps.println(info);
		
		// source :keyword , destination : file 
			//	DataInputStream dis = new DataInputStream(System.in);
			//	FileOutputStream fos = new FileOutputStream("abc.txt",true); //If we keep true before data will remain
			//	PrintStream ps = System.out;
			//	ps.println("Enter the data");
			//	int ch;
			//	while((ch = dis.read())!= '@') {
			//		fos.write(ch);
			//		System.out.println(ch + " " + (char)ch);
			//	}
			//	fos.close();
			//	System.out.println("Data stored in file");
				// source : file , destination : file Copy One File 
			 //   FileInputStream fis = new FileInputStream("abc.txt");
			//	FileOutputStream fos = new FileOutputStream("C:\\demo.txt");
			//	int ch;
			//	while((ch=fis.read()) != -1) {		// -1 = EOF
			//		fos.write(ch);
			//	}
			//	fis.close();
			//	fos.close();
			//	System.out.println("file copied....");
				// source : file , destination : file 	with buffer 
				FileInputStream fis = new FileInputStream("abc.txt");
					BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("D:\\demo.txt");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				int ch;
				while((ch=bis.read()) != -1) {		// -1 = EOF
					bos.write(ch);
				}
				bos.flush();
				fis.close();
				fos.close();
				System.out.println("file copied....");
				
	}

}
