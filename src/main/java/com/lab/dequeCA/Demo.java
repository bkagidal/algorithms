package com.lab.dequeCA;

import java.util.Scanner;

public class Demo {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice;
		CircularDequeA queue = new CircularDequeA(7);
		while(true){
			
			System.out.println("\n");
			System.out.println("1.Insert at the front end");
			System.out.println("2.Insert at the rear end");
			System.out.println("3.Delete from front end");
			System.out.println("4.Delete from rear end");
			System.out.println("5.Display all elements of deque");
			System.out.println("6.Size of deque");
			System.out.println("7.Quit");
			System.out.print("\nEnter Your Choice :");
			
			choice = scan.nextInt();
			
			if(choice == 7)
				break;
			
			switch(choice){
			
			case 1:
					System.out.print("\nEnter Element to insert at front :");
					int ele = scan.nextInt();
					queue.insertAtF(ele);
					break;
			
			case 2:
				System.out.print("\nEnter Element to insert at rear :");
				int ele1 = scan.nextInt();
				queue.insertAtR(ele1);
				break;
				
			case 3:
				queue.deleteFromF();
				break;
				
			case 4:
				queue.deleteFronR();	
				break;
				
			case 5:
				queue.display();
				break;	
				
			case 6:
				System.out.println("Size :"+queue.size());
				break;		
			
			default:	
				System.out.println("\nWrong Choice");
			}
			
			
		}
	}
}
