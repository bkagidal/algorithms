package com.lab.recursion;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num = scan.nextInt();
		
		int sum = digitsum(num);
		System.out.println("SUM :"+sum);
		scan.close();
	}

	private static int digitsum(int num){
		
		if(num/10 == 0)
			return num;
		return digitsum(num/10) + num%10;
	}
}
