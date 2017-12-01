package com.lab.sorting;

import java.util.Scanner;

public class ShellSort {
	
	public static void sort(int a[],int n,int h){
		int i,j,temp;
		while(h>=1){
			
			for(i=h;i<n;i++){
				temp=a[i];
				for(j=i-h;j>=0 && a[j]>temp;j=j-h)
					a[j+h]=a[j];
				
				a[j+h]=temp;
			}
			h=h-2;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Height of Sublist(odd value) :");
		int h = scan.nextInt();
		
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
		sort(a,a.length,h);

		System.out.print("Sorted  Elements :");
		for (int k = 0; k < a.length; k++)
			System.out.print(a[k] + " ");

		scan.close();

	}
}
