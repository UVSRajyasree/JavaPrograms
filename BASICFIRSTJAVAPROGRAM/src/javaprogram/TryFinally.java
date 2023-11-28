package javaprogram;

public class TryFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		try {
			int res =100/1;
			System.out.println("Result is "+res);
			System.out.println("No Exception");
		} finally {
			System.out.println("Finally block");
		}
		System.out.println("Finish");
	}

}
