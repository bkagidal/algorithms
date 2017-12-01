package com.lab.sorting;

import java.util.Scanner;

public class InsertionSort {
	
	
	public static void sort(int a[],int n){
		
		int temp,j;
		
		for(int i=1;i<n;i++){
			
			temp=a[i];
			for( j=i-1;j>=0 && a[j]>temp;j--)
					a[j+1] =a[j];
			
			a[j+1] =temp;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter No Of Elements in Array :");

		int n = scan.nextInt();

		int a[] = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}

		System.out.print("Array Elements :");
		for (int j = 0; j < a.length; j++)
			System.out.print(a[j] + " ");

		System.out.println("\n");
		sort(a,a.length);

		System.out.print("Sorted  Elements :");
		for (int k = 0; k < a.length; k++)
			System.out.print(a[k] + " ");

		scan.close();

	}

}
