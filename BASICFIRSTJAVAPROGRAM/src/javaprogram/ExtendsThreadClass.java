package javaprogram;

class S extends Thread {
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("i "+i);
		}
	}
	
}
class T extends Thread {
	@Override
	public void run() {
		for(int j=0;j<=10;j++) {
			System.out.println("j "+j);
		}
	}
}
public class ExtendsThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S obj1 = new S();
		T obj2 = new T();			// obj1 and obj2 is thread class. 
		obj1.start();
		obj2.start();      // ready to run 
	}

}
