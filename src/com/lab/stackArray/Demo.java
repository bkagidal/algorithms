package com.lab.stackArray;

import java.util.Scanner;

public class Demo {

	static int choice;
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		Stack stack = new Stack();
		
		while(true){
			//System.out.print("\n\n\n");
			System.out.println("\n1.Display Elements");
			System.out.println("2.Insert Element");
			System.out.println("3.Delete Element");
			System.out.println("4.Peek the Eleement");
			System.out.println("5.Size");
			System.out.println("9.Exit");
			System.out.print("\n\n\nEnter Your Choice:");
			
			choice = scan.nextInt();
			
			if(choice ==9){
				System.out.println("\nExiting...");
				break;
			}
			
			switch(choice){
				
			case 1:
					System.out.print("\n");
					stack.display();
					break;
			case 2:
					System.out.print("\nEnter Element :");
					int elem = scan.nextInt();
					stack.push(elem);
					break;
			case 3:
					System.out.print("\n");
					System.out.println("\n"+stack.pop());
					break;
			case 4:
					System.out.print("\n");
					System.out.println(stack.peek());
					break;
			case 5:
				System.out.print("\n");
				System.out.println("Size Of Stack "+stack.size());
				break;
				
			default:
				System.out.println("Wrong Choice");
			}
		}
		scan.close();
	}

}
