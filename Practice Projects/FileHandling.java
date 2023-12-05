package project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Specify The File Path
		String filePath = "C://Users//uppal//Downloads//FileHandling.txt";
		
		//Writing To A File
		writeToFile(filePath, "Hello, Welcome To Java Programming");
		
		//Reading From A File
		String content = readFromFile(filePath);
		System.out.println("Reading the content from File:\n " + content);
		
		//Append To A File
		appendToFile(filePath , "\nWelcome to the File Handling.");
		
		//Reading The File Again To See The Appended Content To The File
		content = readFromFile(filePath);
		System.out.println("Reading Content After Appending : \n" + content);
		
	}

	private static void writeToFile(String filePath, String content) {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
			writer.write(content);
			System.out.println("Content wriitten to the file Successfully.");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	private static String readFromFile(String filePath) {
		StringBuilder content = new StringBuilder();
		try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			String line;
			while((line = reader.readLine()) !=null) {
				content.append(line).append("\n");
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		return content.toString();
	}
	
	private static void appendToFile(String filePath, String content) {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))){
			writer.write(content);
			System.out.println("Content appended to the File Successfully. ");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
