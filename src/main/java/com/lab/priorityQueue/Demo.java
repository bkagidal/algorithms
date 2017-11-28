package com.lab.priorityQueue;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		PriorityQueue queue = new PriorityQueue();
		while(true){
			System.out.println("\n");
			System.out.println("1.Insert new Element");
			System.out.println("2.Delete an element");
			System.out.println("3.Display the queue");
			System.out.println("4.Quit");
			
			System.out.print("\n\nEnter Your Choice :");
			
			int choice = scan.nextInt();
			
			if(choice == 4){
				System.out.println("Exiting.......");
				break;
			}
			
			switch(choice){
			
			case 1:
					System.out.print("Enter Element :");
					int ele = scan.nextInt();
					System.out.print("\nEnter Priority :");
					int pri = scan.nextInt();
					queue.insert(ele, pri);
					break;
			case 2:
				System.out.println("\n");
				queue.delete();
				break;
						
					
			case 3:
					System.out.println("\n");
					queue.display();
					break;
					
				default:
					System.out.println("\n");
					System.out.println("Wrong Choice");
			}
			
		}

	}

}
