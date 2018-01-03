package com.lab.sorting;

import java.util.Scanner;

public class BubbleSort {
	
	public static void sort(int a[],int size){
		
		int temp,swaps;
		
		for(int j=size-2;j>=0;j--){
			swaps=0;
			
			for(int i=0;i<=j;i++){
				if(a[i]>a[i+1]){
					temp = a[i];
					a[i] = a[i+1];
					a[i+1]=temp;
					swaps++;
				}
				
			}
			if(swaps == 0) //already sorted
				break;
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
