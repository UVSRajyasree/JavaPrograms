package javaprogram;

import java.util.ArrayList;

public class ListCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc[]= {10,20,30,40};
		System.out.println(abc);
		System.out.println(abc[0]);
		System.out.println("Size of array "+abc.length);
		ArrayList al = new ArrayList();
		al.add(3);
		al.add(1);
		al.add(9);
		al.add(6);
		al.add(10);
		System.out.println(al);
		System.out.println("Retrieve value using index "+al.get(0));
		System.out.println("Retrieve value using index "+al.get(1));
		al.add(1, 100);		// 1st parameter and 2nd parameter value 
		System.out.println("After added value in 1 index position ");
		System.out.println("Retrieve value using index "+al.get(1));
		System.out.println("Retrieve value using index "+al.get(2));
		System.out.println(al);
		al.remove(2);		// it is remove using index position 
		Integer obj = 100;
		al.remove(obj);		// it remove using value because obj object consider. 	
		System.out.println(al);
		System.out.println("Search "+al.contains(3));
		System.out.println("Search "+al.contains(300));
	}

}
