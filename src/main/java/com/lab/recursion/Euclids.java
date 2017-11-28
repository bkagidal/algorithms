package com.lab.recursion;

import java.util.Scanner;

public class Euclids {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Values for a and b :");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int gcd = GCD(a,b);
		
		System.out.println("GCD of "+a+" and "+b+" is "+gcd);
		
		scan.close();
	}

	
	private static int GCD(int a,int b){
		if( b ==0)
			return a;
		return GCD(b,a%b);
	}
}
