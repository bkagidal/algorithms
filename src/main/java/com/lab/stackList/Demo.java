package com.lab.stackList;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int choice;
		StackL stack = new StackL();
		
		while(true){
			System.out.println("\n1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Size");
			System.out.println("5.display");
			System.out.println("6.Exit");
			
			System.out.println("\nEnter Your Choice :");
			choice = scan.nextInt();
			
			if(choice == 6)
				break;
			switch(choice){
			
			case 1:
				System.out.println("\n Enter Element to Insert :");
				stack.push(scan.nextInt());
				break;
			case 2:
				System.out.println("\n");
				System.out.println(stack.pop());
				break;
			case 3:
				System.out.println("\n");
				System.out.println(stack.peek());
				break;
			case 4:
				System.out.println("\nSize :"+stack.size());
				break;
			case 5:
				System.out.println("\n");
				stack.display();
				break;
				
			default:
				System.out.println("Wrong Choice");
			}
		}
		scan.close();
	}
	
	
	
}
