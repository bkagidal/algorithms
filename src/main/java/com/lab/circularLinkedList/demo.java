package com.lab.circularLinkedList;

import java.util.Scanner;

public class demo {

	private static int choice;
	public static void main(String[] args) {
		
		CircularLinkedList list = new CircularLinkedList();
		
		list.createList();
		
		Scanner scan =new Scanner(System.in);
		
		while(true){
			System.out.println("\n\n");
			System.out.println("1.Display List");
			System.out.println("2.Insert In Empty List");
			System.out.println("3.Insert at Begin List");
			System.out.println("4.Insert at end of List");
			System.out.println("5.Insert After the Node");
			System.out.println("6.Delete First Node");
			System.out.println("7.Delete Last Node");
			System.out.println("8.Delete Any Node");
			System.out.println("9.Exit");
			
			System.out.print("\nEnter Your Choice :");
			
			choice = scan.nextInt();
			
			if(choice == 9){
				System.out.println("Exiting .....");
				break;
			}
			
			switch(choice){
				
			case 1:
					list.displayList();
					break;
			case 2:
				System.out.print("\nEnter Node to Insert :");
				int ele = scan.nextInt();
				list.insertInEmptyList(ele);
				break;
			case 3:
				System.out.print("\nEnter Node to Insert :");
				int ele1 = scan.nextInt();
				list.insertAtBegin(ele1);
				break;
			case 4:
				System.out.print("\nEnter Node to Insert :");
				int ele2 = scan.nextInt();
				list.insertAtEnd(ele2);
				break;
			case 5:
				System.out.print("\nEnter After Which Node to Insert :");
				int ele3 = scan.nextInt();
				System.out.print("\nEnter  Node to Insert :");
				int ele4 = scan.nextInt();
				list.insertAfter(ele3, ele4);
				break;	
			case 6:
				list.deleteFirst();
				break;	
			case 7:
				list.deleteLast()	;
				break;	
			case 8:
				System.out.print("\nDelete Node :");
				int ele5 = scan.nextInt();
				list.deleteAnyNode(ele5);	;
				break;		
			
				
			default:
				System.out.println("Wrong Choice");
			
			}
			
		}

	}

}
