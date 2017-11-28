package com.lab.recursion;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = scan.nextInt();
		
		System.out.print("Enter the power  :");
		int pow = scan.nextInt();
		
		int powNum = power(num,pow);
		
		System.out.println("Power            :"+powNum);
		
		scan.close();
		
	}

	private static int power(int num,int pow){
		if(pow == 0)
			return 1;
		return num * power(num,pow-1);
	}
}
