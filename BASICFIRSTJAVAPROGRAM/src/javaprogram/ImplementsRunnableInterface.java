package javaprogram;

class M implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
	        System.out.println("i "+i);
		}
	}	
}
class N implements Runnable{
	@Override
	public void run() {
		for(int j=0;j<10;j++) {
			System.out.println("j "+j);
		}
	}
}


public class ImplementsRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M obj1  = new M();
		N obj2 = new N();
		Runnable r1 = new M();
		Runnable r2 = new N();			// sub class object and super interface reference. 
		Thread t1 = new Thread(r1);		// t1 passing runnable interface reference. 
		Thread t2 = new Thread(r2);		// t2 
		t1.start();
		t2.start();	
	}

}
