package javaprogram;

interface Abc {					
	int A=10;
	void dis1();
}
interface Xyz {					
	int B=20;
	void dis2();
}

interface Mno extends Abc,Xyz{			
	int C=30;				
	void dis3();
}
class Demo implements Abc,Xyz {
	@Override
	public void dis2() {
		System.out.println("Xyz interface method" + A);
		
	}
	@Override
	public void dis1() {
		System.out.println("Abc interface method" + B);
	}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj1  = new Demo();
		obj1.dis1();
		obj1.dis2();
	}

}
