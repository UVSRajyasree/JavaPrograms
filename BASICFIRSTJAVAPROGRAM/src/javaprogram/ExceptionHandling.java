package javaprogram;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Compiletime
		//System.out.println("Welcome to java");
		//Runtime
		System.out.println("Hi");
		int a=10;
		int b=0;
			try {
			int res = a/b;
			System.out.println("Result is "+res);
			}catch(Exception e) {
				//System.out.println("I Take Care!");
				//System.out.println(e.getMessage());  // short message of exception 
				System.out.println(e.toString());// name of exception as well as message 
			}
		System.out.println("Bye...");
		System.out.println("Bye...");
		System.out.println("Bye...");
		
	}

}
