package com.syntax.reviewclass5;

public class Task2 {

	public static void main(String[] args) {
		// Create a 2D array or integer type where you will store odd and even numbers.
		//Develop a program which will identify/print the even numbers only
		
		int [][]array = {{1,2,3,4,5},{1,2,3,4,5}};
		
		for(int i=0;i<array.length;i++) {
			for(int j=0; j<array[i].length;j++) {
				if(array[i][j]%2==0)
					System.out.println("This is an even number - " + array[i][j]);
			}
		}

	}

}
