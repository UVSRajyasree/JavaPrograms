package javaprogram;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		try {
				int result = 100/0;
			System.out.println("Result is "+result);
			System.out.println("No Exception");
		} catch (Exception e) {
			System.out.println("Catch block" + e);
		}finally {
			System.out.println("finally block");
		}
		System.out.println("Finish");
	}

}
