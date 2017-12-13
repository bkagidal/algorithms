package com.lab.sorting;

import java.util.Scanner;

public class HeapSort {
	
	public static void sort(int a[],int n){
		int maxValue;
		
		buildHeap_BottomUp(a,n);
		
		while(n>1){
			maxValue =a[1];
			a[1] = a[n];
			a[n] = maxValue;
			n--;
			restoreDown(1, a, n);
		}
	}
	
	
	public static void buildHeap_BottomUp(int a[],int n){
		
		for(int i=n/2;i>=1;i--)
			restoreDown(i,a,n);
	}
	
	public static void restoreDown(int i,int a[],int n){
		
		int lchild=2*i;
		int rchild = lchild+1;
		int k = a[i];
		
		while(rchild<=n){
			
			if(k>=a[lchild] && k >= a[rchild]){
				a[i]=k;
				return;
			}
			
			if(a[lchild]>a[rchild]){
				a[i] = a[lchild];
				i = lchild;
			}else{
				a[i] = a[rchild];
				i = rchild;
			}
			
			lchild = 2*i;
			rchild = lchild+1;
		}
		
		if(lchild == n && k<a[lchild]){
			a[i] = a[lchild];
			i = lchild;
		}
		
		a[i] = k;
			
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter No Of Elements in Array :");
		int n = scan.nextInt();
		int a[] = new int[20];
		
		for(int i=1;i<=n;i++)
			a[i]=scan.nextInt();
		
		sort(a,n);
		
		System.out.print("Sorted Array :");
		
		for(int i=1;i<=n;i++)
			System.out.print(a[i]+" ");
		
		scan.close();
			
	}

}
