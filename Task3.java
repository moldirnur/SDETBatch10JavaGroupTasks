package com.syntax.reviewclass5;

public class Task3 {

	public static void main(String[] args) {
		//Create 2D array of integers.Develop a program which will calculate 
		//the sum of even and odd numbers for that array.
		int evenSum=0;
		int oddSum=0;
		int [][]array = {{1,2,3,4,5},{1,2,3,4,5}};
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				if(array[i][j]%2==0) {
					evenSum+=array[i][j];
				}else
					oddSum+=array[i][j];
			}
		}
		System.out.println("Sum of even numbers - " +evenSum);
		System.out.println("Sum of even numbers - " +oddSum);

	}

}
