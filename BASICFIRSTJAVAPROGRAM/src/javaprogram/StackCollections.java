package javaprogram;

import java.util.Stack;

public class StackCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Push, Pull, Search, Peek
		Stack ss = new Stack();
		System.out.println("Empty "+ss.empty());
		ss.push(100);
		ss.push(200);
		ss.push(300);
		ss.push(400);
		System.out.println("Empty "+ss.empty());
		System.out.println(ss);
		System.out.println("Remove "+ss.pop());		// remove and display 
		System.out.println(ss);
		System.out.println("Search top most element "+ss.peek());	// display top most element 
		System.out.println(ss);
		System.out.println("Search element "+ss.search(300));	// top to bottom start from 1
		System.out.println("Search element "+ss.search(200));	// top to bottom start from 1
		System.out.println("Search element "+ss.search(1000));	// top to bottom start from 1 If Element Is Not There It Will Return -1 If Element Is There It Will Return 1 	
	}

}
