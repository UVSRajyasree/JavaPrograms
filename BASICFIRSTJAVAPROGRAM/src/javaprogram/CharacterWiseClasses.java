package javaprogram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CharacterWiseClasses {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		// source : keyboard destination : console 
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
		//InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the id");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Enter the name");
		String name = br.readLine();
		System.out.println("id name "+id);
		System.out.println("name is "+name);
	}

}
