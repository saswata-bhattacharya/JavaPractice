package com.strings;

import java.util.Arrays;

public class StringMehodsPart3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Split Methods
		String data = "Hello World Hi how are you ?";
		
		String words[]=data.split(" ");
		
		for (String temp : words) {
			
			System.out.println(temp);			
		}
		
		System.out.println(Arrays.toString(words));	

	}

}
