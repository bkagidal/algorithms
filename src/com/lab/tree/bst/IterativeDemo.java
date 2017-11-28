package com.lab.tree.bst;

import java.util.Scanner;

public class IterativeDemo {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		BinarySearchTree bst = new BinarySearchTree();
		
		while(true){
			
			System.out.println("1.Display Tree");
			System.out.println("2.Insert Element in Binary Search Tree");
			System.out.println("3.Search Element in Binary Search Tree");
			System.out.println("4. Min Element in Tree");
			System.out.println("5. Max Element in Tree");
			System.out.println("6. Delete Element from tree");
			System.out.println("10.Exiting ...........");
			System.out.println();
			System.out.print("Enter Your Choice :");
			
			int choice = scan.nextInt();
			System.out.println("\n");
			switch(choice){
			
			case 1:
					//System.out.println("Element inserted");
					bst.display();
					break;
			case 2:
				System.out.print("Enter Element to insert :");
				int elem = scan.nextInt();
				bst.insert(elem);
				break;
			
			case 3:
				System.out.print("Enter Element to search :");
				int elem1 = scan.nextInt();
				System.out.println("\n");
				bst.search(elem1);
				break;
			
			case 4:
				System.out.println("\n");
				System.out.println("Minimum Element :"+bst.min());
				break;
			case 5:
				System.out.println("\n");
				System.out.println("Max Element :"+bst.max());
				break;
			
			case 6:
				System.out.print("Enter Element to delete :");
				int elem2 = scan.nextInt();
				System.out.println("\n");
				bst.delete(elem2);
				break;
				
				
			default:
					System.out.println("Wrong Choice");
					break;
			case 10:
					System.out.println("Exiting ...........");
					System.exit(0);
					
				
			}
			
			System.out.println("\n\n");
		}
		

	}

}
