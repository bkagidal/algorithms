package com.lab.sorting;

import java.util.Scanner;

public class QuickSort {

	
	
	public static void sort(int a[],int n){
		
		sort(a,0,n-1);
	}
	
	public static void sort(int a[],int low,int up){
		
		if(low>=up)
			return;
		int p = partition(a,low,up);
		sort(a,low,p-1);
		sort(a,p+1,up);
	}
	
	public static int partition(int a[],int low,int up){
		
		int i=low+1;
		int j =up;
		int temp;
		
		int pivot = a[low];
		
		while(i<=j){
			
			while(a[i]<pivot && i<up)
				i++;
			
			while(a[j]> pivot)
				j--;
			
			if(i<j){
				temp = a[i];
				a[i]  = a[j];
				a[j] = temp;
				i++;
				j--;
			}else
				break;
			
		}
		
		a[low] = a[j];
		a[j] = pivot;
		
		return j;
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter No Of Elements in the Array :");
		int n = scan.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		
		sort(a,n);
		
		System.out.print("Sorted Array :");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		scan.close();
	}

}
