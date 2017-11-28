package com.lab.QueueList;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		QueueList queue = new QueueList();
		while(true){
			System.out.println("\n");
			System.out.println("1.Insert Element in the Queue");
			System.out.println("2.Delete Element from the Queue");
			System.out.println("3.Display Element at the front");
			System.out.println("4.Display allElements of the Queue");
			System.out.println("5.Display size of the Queue");
			System.out.println("6.Quit");
			
			System.out.print("\n\nEnter Your Choice :");
			
			int choice = scan.nextInt();
			
			if(choice == 6){
				System.out.println("Exiting.......");
				break;
			}
			
			switch(choice){
			
				case 1:
						System.out.print("\nEnter Element to Insert :");
						int ele = scan.nextInt();
						queue.enQueue(ele);
						break;
				case 2:
					System.out.println("\n");
					queue.deQueue();
					break;
				
				case 3:
					System.out.println("\n");
					queue.displayFirst();
					break;	
					
				case 4:
					System.out.println("\n");
					queue.display();
					break;
				
				case 5:
					System.out.println("\n"+queue.size());
					
					break;	
					
				default:
					System.out.println("\n");
					System.out.println("Wrong Choice");
			}
			
		}

	}

}
