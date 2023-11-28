package javaprogram;

abstract class P {
	abstract void dis1();
}
class R extends P {
@Override
void dis1() {
	System.out.println("A class method overrided by B class");
}
void dis2() {
	System.out.println("B class method its own mthod ");
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//P obj1 = new R();			// creating super class object we can't create object ie abstrat 
				//obj1.dis1();
				R obj2  = new R();			// creating sub class object 
				obj2.dis1();
				obj2.dis2();
				//R obj3 = new P();		// super class object and sub class reference not possible. 
				P obj4 = new R();		// sub class object and super class reference possible. super class can be abstract class.  
				obj4.dis1();						// with help of abstract class reference we can call only those methods  
				//obj4.dis2();					// that abstract class. 
			}							
		}
	}


