package javaprogram;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee emp=new Employee();
    emp.id=1;
    emp.name="Ram";
    emp.salary=100000;
    emp.display();
    
    Customer c1=new Customer();
    c1.setCid(100);
    c1.setName("Ram");
    c1.setAge(21);
    
    System.out.println("Customer");
    System.out.println("Customer id is:" + c1.getCid());
    System.out.println("Customer name is:" + c1.getName());
    System.out.println("Customer age is :" + c1.getAge());
    
	}

}
