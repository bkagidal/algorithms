package com.lab.sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void sort(int a[]) {

		int minIndex, temp;
		int n = a.length;

		for (int i = 0; i < n - 1; i++) {

			minIndex = i;

			for (int j = i + 1; j < n; j++) {

				if (a[j] < a[minIndex])
					minIndex = j;
			}

			if (i != minIndex) {
				temp = a[i];
				// if(a[i]<a[minIndex])
				a[i] = a[minIndex];
				a[minIndex] = temp;
			}

		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter No Of Elements in Array :");

		int n = scan.nextInt();

		int a[] = new int[n];

		// System.out.print("Enter No Of Elements in Array :");
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}

		System.out.print("Array Elements :");
		for (int j = 0; j < a.length; j++)
			System.out.print(a[j] + " ");

		System.out.println("\n");
		sort(a);

		System.out.print("Sorted  Elements :");
		for (int k = 0; k < a.length; k++)
			System.out.print(a[k] + " ");

		scan.close();

	}

}
