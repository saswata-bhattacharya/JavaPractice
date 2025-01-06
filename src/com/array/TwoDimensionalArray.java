package com.array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		//Traversing using for loop
//		for (int index = 0; index < a.length; index++ ) {
//			System.out.println(a[index]);
//		}
		
		//Traversing using for each loop
//		for(int temp:a) {
//			System.out.println(temp);
//		}
		
		int b[][]= new int [2][2];
		
		b[0][0]=10;
		b[0][1]=20;
		b[1][0]=30;
		b[1][1]=40;
		
		for( int rowIndex = 0; rowIndex<b.length; rowIndex++) {
			for(int colIndex =0; colIndex<b[0].length; colIndex++) {
				//System.out.println(rowIndex+" "+colIndex);
				System.out.print(b[rowIndex][colIndex]+" ");
			}
			System.out.println("");
		}
		

	}

}
