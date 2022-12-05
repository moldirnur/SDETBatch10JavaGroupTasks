package com.syntax.reviewclass5;

public class Task5 {

	public static void main(String[] args) {
		// Write a program to check whether a given number is prime or not?
		// a number that us divisible only by itself and 1; 
		//negative numbers are not prime numbers
		
		int number=15;
		boolean isPrime=true;
		if(number>1) {
			for(int i=2;i<number;i++) {
				if(number%i==0) {
					isPrime=false;
					break;
				}
			}
		}else {
			isPrime=false;
		}
		System.out.println(number + " is prime " + isPrime);
		

	}

}
