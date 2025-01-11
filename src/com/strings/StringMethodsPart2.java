package com.strings;

public class StringMethodsPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = "Hello World";
		
		//substring
		String result = data.substring(1,5);
		System.out.println(result);
		
		//replace		
		String replaced = data.replace('l', 'L');
		System.out.println(replaced);
		
		//indexOf
		int indexOfCharacter = data.indexOf('o'); //Returns the index of the first occurance
		System.out.println(indexOfCharacter);
		
		//
		int lastindexOfCharacter = data.lastIndexOf('o');//Returns the index of the last occurance
		System.out.println(lastindexOfCharacter);
	}

}
 