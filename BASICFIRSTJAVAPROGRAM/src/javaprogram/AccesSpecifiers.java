package javaprogram;


public class AccesSpecifiers {
	private int id;
	String name;
	protected float salary;
	public String designation;

	public void disEmp() {
		System.out.println("id "+id);
		System.out.println("name "+name);
		System.out.println("salary "+salary);
		System.out.println("designation "+designation);
	}
	public static void main(String args[]) {
		
	}
}