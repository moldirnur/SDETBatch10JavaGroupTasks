package com.syntax.reviewclass5;

public class Task4 {

	public static void main(String[] args) {
		//Write a program to swap 2 numbers without temporary variable
		
		int a=10;
		int b=20;
		
		a=a+b; //30
		b=a-b; //10
		a=a-b;
		
		System.out.println(a +"-" + b);
		

	}

}
