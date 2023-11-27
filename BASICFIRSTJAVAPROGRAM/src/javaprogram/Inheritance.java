package javaprogram;

class Employee1{
	void id() {
		System.out.println("Employee ID");
	}
}
class Manager extends Employee1{
	void no() {
		System.out.println("Manager Number");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Manager m=new Manager();
    m.no();
    m.id();
	}

}
