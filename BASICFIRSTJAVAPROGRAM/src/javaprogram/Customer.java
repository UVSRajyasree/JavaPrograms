package javaprogram;

public class Customer {
private int cid;
private String name;
private int age;
//Setters And Getters 
	public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
	public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
	public Customer(int cid, String name, int age) {
		super();
		this.cid = cid;
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
