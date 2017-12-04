package com.lab.sorting;

import java.util.Scanner;

public class Merging {

	public static int[] merge(int a[], int b[]) {
		int i = 0, j = 0, k = 0;

		int alen = a.length;
		int blen = b.length;

		int temp[] = new int[alen + blen];

		while ((i <= alen - 1) && (j <= blen - 1)) {

			if (a[i] < b[j])
				temp[k++] = a[i++];
			else
				temp[k++] = b[j++];

		}

		while (i <= alen - 1) {
			temp[k++] = a[i++];
		}

		while (j <= blen - 1)
			temp[k++] = b[j++];

		return temp;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter No Of Elements in first Array :");
		int n = scan.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}

		System.out.print("Enter No Of Elements in Second Array :");
		int n1 = scan.nextInt();
		int a1[] = new int[n1];

		for (int i = 0; i < a1.length; i++) {
			a1[i] = scan.nextInt();
		}
		
		

		int temp[] = merge(a, a1);

		
		System.out.println("\nFirst Array");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

		System.out.println("\nSecond Array");
		for (int i = 0; i < a1.length; i++)
			System.out.print(a1[i] + " ");

		
		System.out.println("\nSorted Array");
		for (int i = 0; i < temp.length; i++)
			System.out.print(temp[i] + " ");

		scan.close();
	}

}
