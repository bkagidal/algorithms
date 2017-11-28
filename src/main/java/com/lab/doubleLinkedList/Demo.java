package com.lab.doubleLinkedList;

import java.util.Scanner;

public class Demo {

	
	
	public static void main(String[] args) {
	
		DoubleLinkedList list = new DoubleLinkedList();
		
		list.createList();
		
		Scanner scan = new Scanner(System.in);
		int choice ;
		
		
		
		
		while(true){
			
			System.out.println("\n");
			System.out.println("1.Display List");
			System.out.println("2.Counter The No Of Nodes");
			System.out.println("3.Search for an element");
			System.out.println("4.Insert in empty list/Insert in begining of the list");
			System.out.println("5.Insert at End of List");
			System.out.println("6.Insert After Node");
			System.out.println("7.Insert Before Node");
			System.out.println("8.Insert node at Specific position");
			System.out.println("9.Delete First Node");
			System.out.println("10.Delete Last Node");
			System.out.println("11.Delete Any Node");
			System.out.println("12.Reverse List");
			System.out.println("13.Exit");
			
			System.out.print("Enter your choice : ");
			
			choice = scan.nextInt();
			
			if(choice ==13)
				break;
			
			switch(choice){
				
				case 1:
						System.out.println("\n");
						list.displayList();
						break;
						
				case 2:
					System.out.println("\nTotal Nodes : "+list.countNodes());
					break;
					
				case 3:
					System.out.println("\nEnter element to search :");
					int ele = scan.nextInt();
					list.searchElement(ele);
					break;
					
				case 4:
					System.out.println("\nEnter element to insert :");
					int ele1 = scan.nextInt();
					list.insertAtBegining(ele1);
					break;	
				case 5:
					System.out.println("\nEnter element to insert :");
					int ele2 = scan.nextInt();
					list.insertAtEnd(ele2);
					break;		
					
				case 6:
					System.out.println("\nEnter After Which Node to insert :");
					int ele3 = scan.nextInt();
					System.out.println("\nEnter Element :");
					int ele4 = scan.nextInt();
					list.insertAfterNode(ele3,ele4);
					break;
				
				case 7:
					System.out.println("\nEnter Before Which Node to insert :");
					int ele5 = scan.nextInt();
					System.out.println("\nEnter Element :");
					int ele6 = scan.nextInt();
					list.insertBeforeNode(ele5,ele6);
					break;
					
				case 8:
					System.out.println("\nEnter position of Node to insert :");
					int ele7 = scan.nextInt();
					System.out.println("\nEnter Element :");
					int ele8 = scan.nextInt();
					list.insertNodeAtpos(ele7,ele8);
					break;	
					
				case 9:
					list.deleteFirstNode();
					break;
				case 10:
					list.deleteLastNode();
					break;	
					
				case 11:
					System.out.println("\nDelete Node  :");
					int ele9 = scan.nextInt();
					list.deleteNode(ele9);;
					break;
				case 12:
					list.reverseList();
					break;	
						
					
				default:
					System.out.println("Wrong Choice");
				
			}
		}
		
		System.out.println("Exiting the Code");
	}

}
