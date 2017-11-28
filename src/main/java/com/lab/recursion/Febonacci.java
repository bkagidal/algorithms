package com.lab.recursion;

import java.util.Scanner;

public class Febonacci {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Febonacci series up to number :");
		int n = scan.nextInt();
		
		for(int i=0;i<n;i++)
			System.out.print(feb(i)+" ");
		
		scan.close();
		
	}

	private static int feb(int n){
		if(n ==0)
			return 0;
		if(n ==1)
			return 1;
		return feb(n-1)+feb(n-2);
	}
}
