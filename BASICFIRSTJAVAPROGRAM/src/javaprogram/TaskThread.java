package javaprogram;

class Task implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int i=0;i<5;i++) {
		System.out.println("called.."+name+" i "+i);
		try {
		Thread.sleep(1000);
		}catch(Exception e) {}
		}
	}
}
public class TaskThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		Task tt1 = new Task();
		Thread t1 = new Thread(tt1);
		Thread t2 = new Thread(tt1);
		Thread t3 = new Thread(tt1);
		System.out.println(t);
		t1.setName("Ravi");
		t2.setName("Ajay");
		t3.setName("Vijay");
		//BeforeStart
		System.out.println("First thread status "+t1.isAlive());
		System.out.println("Second thread status "+t2.isAlive());
		System.out.println("Third thread status "+t3.isAlive());
		t1.start();
		t2.start();
		t3.start();
		//After Start
		System.out.println("First thread status "+t1.isAlive());
		System.out.println("Second thread status "+t2.isAlive());
		System.out.println("Third thread status "+t3.isAlive());
	}

}
