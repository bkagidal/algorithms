package singleLinkedList;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		int choice,data,k,x;
		
		SingleLinkedList list = new SingleLinkedList();
		list.createList();
		
		Scanner scan1 = new Scanner(System.in);
		
		while(true){
			System.out.println("\n");
			System.out.println("1.Display List");
			System.out.println("2.Count the number of nodes");
			System.out.println("3.Search for an element");
			System.out.println("4.Insert in empty list/Insert in beginning of the list");
			System.out.println("5.Insert a node at the end of the list");
			System.out.println("6.Insert a node after a specific node");
			System.out.println("7.Insert a node before a specific node");
			System.out.println("8.Insert a node at a given position");
			System.out.println("9.Delete first node");
			System.out.println("10.Delete last node");
			System.out.println("11.Delete any node");
			System.out.println("12.Reverse the list");
			System.out.println("13.Bubble sort by exchanging the data");
			System.out.println("14.Bubble sort by exchanging the links");
			System.out.println("15.MergeSort");
			System.out.println("16.Insert Cycle");
			System.out.println("17.Detect Cycle");
			System.out.println("18.Remove Cycle");
			System.out.println("19.Quit");
			
			System.out.print("Enter your choice : ");
			
			choice = scan1.nextInt();
			
			if(choice == 19)
				break;
			
			switch(choice){
			
				case 1:
					System.out.println("\n");
					list.displayList();
					System.out.println("\n");
					break;
				case 2:
					System.out.println("\n");
					System.out.println(list.countNoofNodes());
					System.out.println("\n");
					break;
				case 3:
					System.out.println("\nEnter Element to Search :");
					int ele = scan1.nextInt();
					list.SearchForElement(ele);
					System.out.println("\n");
					break;
				case 4:
					System.out.println("\nEnter Element to Insert :");
					int ele1 = scan1.nextInt();
					list.insertAtBegin(ele1);
					System.out.println("\n");
					break;
					
				case 5:
					System.out.println("\nEnter Element to Insert :");
					int ele2 = scan1.nextInt();
					list.insertAtEnd(ele2);
					System.out.println("\n");
					break;	
				
				case 6:
					System.out.println("\nAfter Which Node to Insert Element :");
					int ele3 = scan1.nextInt();
					
					System.out.println("\nEnter Element to Insert :");
					int ele4 = scan1.nextInt();
					list.insertAfterNode(ele3, ele4);
					System.out.println("\n");
					break;	
					
				case 7:
					System.out.println("\nBefore Which Node to Insert Element :");
					int ele5 = scan1.nextInt();
					
					System.out.println("\nEnter Element to Insert :");
					int ele6 = scan1.nextInt();
					list.insertBeforeNode(ele5, ele6);
					System.out.println("\n");
					break;	
					
				case 8:
					System.out.println("\nEnter Position to Insert Element :");
					int pos = scan1.nextInt();
					
					System.out.println("\nEnter Element to Insert :");
					int pdata = scan1.nextInt();
					list.insertAtposition(pos, pdata);
					System.out.println("\n");
					break;	
					
				case 9:
					list.deleteFirstNode();
					System.out.println("\n");
					break;	
					
				case 10:
					list.deleteLastNode();
					System.out.println("\n");
					break;
					
				case 11:
					System.out.println("Enter Node to delete :");
					int delEle = scan1.nextInt();
					list.deleteAnyNode(delEle);
					System.out.println("\n");
					break;
					
				case 12:
					list.reverseList();
					System.out.println("\n");
					break;
					
				case 13:
					list.bubbleSortExchData();
					System.out.println("\n");
					break;
							
				case 14:
					
					list.bubbleSortExchLinks();
					System.out.println("\n");
					break;	
						
				case 15:
					list.mergeSort();
					System.out.println("\n");
					break;	
					
				case 16:
					System.out.println("Enter Node for  Cycle :");
					int cNode = scan1.nextInt();
					list.insertCycle(cNode);
					System.out.println("\n");
					break;	
					
				case 17:
					System.out.println("\n");
					Node node =list.findCycle();
					if(node == null)
						System.out.println("No Cycle detected");
					else
						System.out.println("Cycle detected at : "+node.info);
					System.out.println("\n");
					break;	
					
				case 18:
					list.removeCycle();;
					System.out.println("\n");
					break;	
				default:
					System.out.println("\n");
					System.out.println("Wrong Choice");
				
			}
			System.out.println();
		}
		scan1.close();
		System.out.println("Exiting");
		//System.out.print("\033[H\033[2J");
		//System.out.flush();

	}

}
