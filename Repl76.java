package com.syntax.reviewclass5;

public class Repl76 {

	public static void main(String[] args) {
		
		//Create 2D array of integer values. Print the sum of all numbers.
		
		int[][]array = {{1,2,3,4,5},
				        {10,20,30,40,50}};
		int sum=0;
		System.out.println("Number of rows in the 2D array-"+ array.length);
		
		for(int row=0;row<array.length;row++) {
			System.out.println("Number of columns in the " + row + " row-" + array[row].length);
			for(int col=0;col<array[row].length;col++) {
				System.out.print(array[row][col]);
				
				sum+=array[row][col];
			}
			System.out.println();
		}
		System.out.println("sum - "+sum);
	                          
	
	}
	
}

	


