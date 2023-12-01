package javaprogram;

import java.util.Scanner;

public class EmployeeTestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Use EmployeeB Class 
		//Array
	    // Can create more than One Employee
		Scanner sc = new Scanner(System.in);
		System.out.println("how many record do you want to store");
		int n = sc.nextInt();
		EmployeeB employees[]=new EmployeeB[n];	// array is known as fixed memory 
		System.out.println("Plz enter all employee details one by one");
		for(int i=0;i<n;i++) {
			employees[i]=new EmployeeB();
			System.out.println("Enter the id");
			int id = sc.nextInt();
			employees[i].setId(id);
			System.out.println("Enter the name");
			String name = sc.next();
			employees[i].setName(name);
			System.out.println("Enter the salary");
			float salary = sc.nextFloat();
			employees[i].setSalary(salary);
		}
		// business logic
		System.out.println("All employee records");
		
		for(EmployeeB emp:employees) {
			System.out.println(emp);    // toString()
		}
	}

}
