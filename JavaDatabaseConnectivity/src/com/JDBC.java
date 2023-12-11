package com;
import java.sql.*;
import java.util.Scanner;

public class JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Connect Jar File Driver BuildPath Configure Path Libraries Class Path Add External Jar Files IN That Folder Project
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully");
			
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root" ,"AaBb@12345678");
			System.out.println("Connected Successfully");
			
			//DML Data Manipulation Lanaguage
			//Insert Query
			Statement stmt = con.createStatement();
			System.out.println("Statement created");
			int result = stmt.executeUpdate("insert into employee values(5, 'Krishna', 25000)");
			if(result>0) {
				System.out.println("Record Inserted Successfully");
			}
			
			//Delete Query
		
	//		int result = stmt.executeUpdate("delete from where id = 6");
	//		if(result>0) {
	//			System.out.println("Record Inserted Successfully");
	//		}
	//		else {
	//			System.out.println("Record Not Prsent");
	//		}
			
			//Update Query
	//		int result = stmt.executeUpdate("update employee set salary = 65000 where id =123");
	//		if(result>0) {
	//			System.out.println("Record Updated Successfully");
	//		}else {
	//			System.out.println("Record Not Present");
	//		}
			
			//DRL Data Query Language
			//Retrieve Query
	//		ResultSet rs = stmt.executeQuery("select * from employee");
	//		while(rs.next()) {
	//			//System.out.println("Id " + rs.getInt(1) + "Name is " + rs.getString(2) + "Salary is " + rs.getFloat("salary"));
	//			System.out.println(" Id "+ rs.getInt("id") + "Name is"+rs.getString("name") + "Salary is "+rs.getFloat("salary"));
	//		}
			
//		 Scanner sc =new Scanner(System.in);
		 //Insert Query Using Prepared Statement
//		 PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
		 
//		 System.out.println("Enter the id");
//		 int id = sc.nextInt();
//		 pstmt.setInt(1, id);
		 
//		 System.out.println("Enter the name");
//		 String name = sc.next();
//		 pstmt.setString(2, name);
		 
//		 System.out.println("Enter the salary");
//		 float salary =sc.nextFloat();
//		 pstmt.setFloat(3, salary);
		 
//		 int result = pstmt.executeUpdate();
//		 if(result > 0) {
//			 System.out.println("Record Inserted Successfully");
//		 }
		 
		 //Delete Query Using Prepared Statement
//		 PreparedStatement pstmt = con.prepareStatement("delete from employee where id = ?");
		 
//		 System.out.println("Enter the id ");
//		 pstmt.setInt(6, id);
		 
//		 int result = pstmt.executeUpdate();
		 
//		 if(result > 0) {
//			 System.out.println("Record Deleted Successfully");
//		 }else {
//			 System.out.println("Record not Present");
//		 }
		 
		
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
