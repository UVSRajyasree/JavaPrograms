package project;

import java.util.Scanner;

public class ValidateEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array of Employee email IDs
		String[] employeeEmails = {"ram@gmail.com", "lakshman@gmail.com" , "arjun@gmail.com" , "krishna@gmail.com", "janaki@gmail.com", "maha@gmail.com" , "padma@gmail.com", "radha@gmail.com"};
		
		
		//email ID to be entered by user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an email ID: ");
		String userEnteredEmail =scanner.nextLine();
		
		//Search for the email ID in the array of strings entered by user
		boolean found = false;
		for(String email : employeeEmails) {
			if (email.equals(userEnteredEmail)) {
				found = true;
				break;
			}
		}
		
		//To Display if the email is found
		if(found) {
			System.out.println("Employee Email ID is found.");
		}else{
			System.out.println("Employee Email ID is not found. Please Enter Email ID:");
		}
		scanner.close();
     }

}
