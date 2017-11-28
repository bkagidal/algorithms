package com.lab.QueueArray;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice;
		Queue queue = new Queue();
		
		while(true){
			System.out.println("\n1.Display");
			System.out.println("2.Add Element To Queue");
			System.out.println("3.Delete Element from Queue");
			System.out.println("4.Queue Size");
			System.out.println("5.Exit");
			
			System.out.println("\nEnter Your Choice :");
			choice = scan.nextInt();
			
			if(choice == 5)
				break;
			switch(choice){
			
			case 1:
				System.out.println("\n");
				queue.display();
				break;
				
			case 2:
				System.out.println("\n");
				System.out.println("Enter Element :");
				int ele = scan.nextInt();
				queue.enqueue(ele);
				break;
			
			case 3:
				System.out.println("\n");
				System.out.println(queue.dequeue() + " deleted ");
				break;
			case 4:
				System.out.println("\nSize :" + queue.size());
				break;
			default:
				System.out.println("Wrong Choice");
			}
		}
		
		scan.close();

	}

}
