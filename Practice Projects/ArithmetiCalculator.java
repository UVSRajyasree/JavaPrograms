package project;

import java.util.Scanner;

public class ArithmetiCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		double number1,number2,result;
		char operator;
		
		System.out.println("This is Arithmetic Calculator");
		
		//Input First Number
		System.out.println("Enter First Number: ");
		number1 = scanner.nextDouble();
		
		//Input Second Number
		System.out.println("Enter Second Number: ");
		number2 = scanner.nextDouble();
		
		//Operators
		System.out.println("1. Addition Operator is +");
		System.out.println("2. Subtraction Operator is -");
		System.out.println("3. Multiplication Operator is *");
		System.out.println("4. Division Operator is /");
		
		//Input Arithmetic Operator
		System.out.println("Enter an Arithmetic Operator(+,-,*,/): ");
		operator = scanner.next().charAt(0);
		
		
		//Perform Calculation Based On Operator
		switch(operator) {
		//Addition
		case '+':
			result = number1 + number2;
			System.out.println(number1 + "+" + number2 + "=" + result);
			System.out.println("Addition of Two Numbers is: "+ result);
		    break;
	    //Subtraction
		case '-':
			result = number1 - number2;
			System.out.println(number1 + "-" + number2 + "=" + result);
			System.out.println("Subtraction of Two Numbers is: "+result);
			break;
		
		//Multiplication
		case '*':
			result = number1 * number2;
			System.out.println(number1 + "*" + number2 + "=" + result);
			System.out.println("Multiplication of Two Numbers is: "+result);
			break;
		
	    //Division
		case '/':
			if (number2!=0) {
				result = number1/number2;
				System.out.println(number1 + "/" + number2 + "=" + result);
				System.out.println("Division of Two Numbers is: "+result);
			}else {
				System.out.println("Error : Division by zero is undefined.");
			}
			break;
			
		default:
			System.out.println("Invalid Operator");		
		}
	
     scanner.close();
	}
}
