package com.lab.recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num = scan.nextInt();
		
		int val = factorial(num);
		System.out.println(num +" Factorial is :"+val);
		scan.close();
	}
	
	private static int factorial(int n){
		
		if(n == 0)
			return 1;
		return n * factorial(n-1);
	}

}
