package com.lab.recursion;

import java.util.Scanner;

public class BaseConversion {
 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number to convert :");
		int n = scan.nextInt();
		
		System.out.print("Binary Form        :");
		toBinary(n);
		System.out.print("\nOctal Form       :");
		convertBase(n,8);
		System.out.print("\nHexadecimal Form :");
		convertBase(n,16);
		
		scan.close();
	}
	
	private static void toBinary(int n){
		
		if(n==0)
			return;
		toBinary(n/2);
		System.out.print(n%2);
	}
	
	private static void convertBase(int n, int base){
		
		if(n==0)
			return;
		convertBase(n/base,base);
		
		int remainder = n%base;
		if(remainder <10 )
			System.out.print(remainder);
		else
			System.out.print((char)(remainder-10+'A'));
		
	}

}
