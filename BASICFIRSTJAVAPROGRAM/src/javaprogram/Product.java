package javaprogram;

public class Product {
private int pid;
private String name;
private float price;
public Product() {
	super();
}
public Product(int pid, String name, float price) {
	super();
	this.pid = pid;
	this.name = name;
	this.price = price;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
	@Override
public String toString() {
	return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
