package javaprogram;

public class StringBufferS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Raj";
		System.out.println(name);
	System.out.println(name+" Deep");
	System.out.println(name.toLowerCase());
		System.out.println(name);
		name = name+" Deep";
		System.out.println(name);
		System.out.println("---------------");
		//StringBuffer sb ="Welcome";
		//String Buffer is mutable String Builder is Mutable If any changes Made to String the original 
		//String will not change but String Buffer and String Builder will change
		StringBuffer sb = new StringBuffer("Raj");
		System.out.println(sb);
		System.out.println(sb.append("Deep"));
			System.out.println(sb);
			System.out.println(sb.delete(2, 4));
			System.out.println(sb);
			sb.insert(2, " Kumar d");
			System.out.println(sb);
			sb.reverse();
			System.out.println(sb);
	}

}
