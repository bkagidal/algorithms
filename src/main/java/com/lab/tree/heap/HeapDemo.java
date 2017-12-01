package com.lab.tree.heap;

import java.util.Scanner;

public class HeapDemo {
	
	public static void main(String[] args) {
				Heap heap = new Heap();
				Scanner scan = new Scanner(System.in);
				
				while(true){
					//System.out.println("\n");
					System.out.println("1.Display");
					System.out.println("2.Insert");
					System.out.println("3.Delete");
					System.out.println("4.Exit");
					System.out.print("\nEnter Your Choice :");
					int choice = scan.nextInt();
					
					if(choice ==4){
						System.out.println("\nExiting.....");
						break;
					}
					switch(choice){
					
						case 1:
									System.out.println("\n");
									heap.display();
									System.out.println("\n");
									break;
						case 2:
								    System.out.print("\nEnter Element To Insert :");
								    int elem = scan.nextInt();
								    heap.insert(elem);
								    break;
						case 3:
									int elem1 = heap.delete();
									System.out.println("\nElement "+elem1+"  Deleted");
									System.out.println("\n");
									break;
						
						default:
									System.out.println("\nWrong Chice");
									break;
					}
				}
	}

}
