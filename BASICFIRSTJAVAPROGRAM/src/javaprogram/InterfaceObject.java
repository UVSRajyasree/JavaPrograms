package javaprogram;

interface C {
	abstract void dis1();
}
class D implements C {
@Override
public void dis1() {
	System.out.println("A class method overrided by B class");
}
void dis2() {
	System.out.println("B class method its own mthod ");
}
}
public class InterfaceObject {
	public static void main(String[] args) {
		//C obj1 = new D();			// interface we can't create object. 
		//obj1.dis1();
		D obj2  = new D();			// creating sub class object 
		obj2.dis1();
		obj2.dis2();
		//D obj3 = new C();		// super class object and sub class reference not possible. 
		C obj4 = new D();		// sub class object and interface reference possible.
		obj4.dis1();           // using this reference we can call only those method which belong to that interface. 
	}
}
