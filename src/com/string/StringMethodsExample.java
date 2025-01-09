package com.string;

public class StringMethodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = "     apple";
		String data2 = "Apple";
		String data3 = "";
		//String data4 = null;
		
		System.out.println(data1.hashCode());
		System.out.println(data2.hashCode());
		
		//Method 1: equals and equalIgnoreCase		
		System.out.println(data1.equals(data2));
		System.out.println(data1.equalsIgnoreCase(data2));
		
		//Method 2: Length Check
		System.out.println(data1.length());
		
		//Method 3: trim()
		String data = data1.trim();
		System.out.println(data.length());
		
		//Method 4 & 5: toLowerCase and toUpperCase
		System.out.println(data.toUpperCase());
		System.out.println(data.toLowerCase());
		
		//Method 6: String concat -> Joining of multiple strings		
		System.out.println(data+"abc");
		System.out.println(data.concat("-newton"));
		
		//Method 7: charAt()
		System.out.println(data.charAt(3));
		
		//Method 8:contains()		
	    System.out.println(data.contains("le"));
	    
	    //Method 9: isEmpty
	    System.out.println(data3.isEmpty());
	   // System.out.println(data4.isEmpty());  //Null pointer exception
	    
	    
		
		
		
		
		

	}

}
