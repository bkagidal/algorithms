package com.lab.recursion;

import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num = scan.nextInt();
		print1(num);
		System.out.println("\n");
		print2(num);
		scan.close();
	}

	private static void print1(int n){
		
		if(n == 0)
			return;
		System.out.print(n +" ");
		print1(n-1);
	}
	
	private static void print2(int n){
		
		if(n == 0)
			return;
		print2(n-1);
		System.out.print(n + " ");
	}
}
