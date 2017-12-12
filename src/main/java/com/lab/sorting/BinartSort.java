package com.lab.sorting;

import java.util.Scanner;

public class BinartSort {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter No Of Elements :");
		
		int n = scan.nextInt();
		TreeNode tree = new TreeNode(n);
		
		for(int i=0;i<n;i++)
			tree.insert(scan.nextInt());
		
		
		System.out.println("Sorted Elements");
		
		tree.print();
		
		scan.close();
		
	}

}
