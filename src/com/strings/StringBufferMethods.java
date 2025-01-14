package com.strings;


public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello World"; //String Intern pool -- String Literal
		
		String str1 = new String("Hello World"); //Heap -- String object
		
		StringBuffer sb = new StringBuffer("Hello World");
		
		//Length of String		
		System.out.println(str.length());
		System.out.println(sb.length());
		
		//Concatenation 
		System.out.println(str+"123");
		System.out.println(str.concat("123456"));
		System.out.println(sb.append(987));
		
		//charAt
		System.out.println(str.charAt(0));
		System.out.println(sb.charAt(0));
		
		//indexOf
		System.out.println(str.indexOf('W'));
		System.out.println(sb.indexOf("ello"));
		
		//lastIndexOf
		System.out.println(str.lastIndexOf('l'));
		System.out.println(sb.lastIndexOf("l"));
		
		//isEmpty
		System.out.println(str.isEmpty());
		StringBuffer sb1 = new StringBuffer("");
		//System.out.println(sb1.isEmpty());
		
		//Reverse
		System.out.println(sb);
		//System.out.println(sb.reverse());
		
		//Insert(int offset, String)
		//System.out.println(sb.insert(11, null));
		
		//deleteCharAt
		System.out.println(sb.deleteCharAt(4));
		
		//delete -> from a range of index
		System.out.println(sb.delete(0, 4));
		
		//replace(int start, int end, subString)
		System.out.println(sb.replace(0, 4, "Hiiii"));
		
		//capacity
		StringBuffer sb2 = new StringBuffer();
		System.out.println(sb2.capacity());
		sb.append("This is a sample text");
		System.out.println(sb.capacity());
		/*
		 * How is the capacity calculated in String Buffer
		 * new_capacity = (old_capacity *2) + 2		
		*/	
		

	}

}
