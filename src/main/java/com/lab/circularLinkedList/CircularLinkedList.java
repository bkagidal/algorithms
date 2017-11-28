package com.lab.circularLinkedList;

import java.util.Scanner;

public class CircularLinkedList {

	Node last;
	Scanner scan;

	public CircularLinkedList() {
		last = null;
		scan = new Scanner(System.in);
	}

	public void insertAtBegin(int x) {

		Node temp = new Node(x);

		temp.link = last.link;
		last.link = temp;

	}

	public void insertAtEnd(int x) {

		Node temp = new Node(x);
		temp.link = last.link;
		last.link = temp;
		last = temp;
	}

	public void insertInEmptyList(int x) {

		Node temp = new Node(x);

		last = temp;
		last.link = temp;
	}

	public void createList() {

		System.out.print("Enter No of Nodes :");

		int n = scan.nextInt();
		int data;

		for (int i = 1; i <= n; i++) {
			System.out.print("Enter Node :");
			data = scan.nextInt();
			if (i == 1)
				insertInEmptyList(data);
			else
				insertAtEnd(data);

		}

	}

	public void insertAfter(int node, int data) {
		
		//Node temp = new Node(data);
		
		Node p = last.link;
		do{
			if(p.info == node)
				break;
			p = p.link;
			
		}while(p != last.link);
		
		 if(p == last)
			insertAtEnd(data);
		else{
			Node temp = new Node(data);
			temp.link = p.link;
			p.link = temp;
		}

	}
	
	public void deleteFirst(){
		
		Node p =last.link;
		
		if( p == last){
			last = null;
		}else{
			p = p.link;
			last.link = p;
		}
		
	}
	
	public void deleteLast(){
		
		Node p  = last.link;
		
		do{
			if(p.link == last)
				break;
			p = p.link;
			
		}while(p.link != last);
		
		if(last == p)
			last =null;
		else{
		p.link = last.link;
		last = p;
		}
		
		
	}
	
	public void deleteAnyNode(int x){
		
		Node p = last.link;
		
		do{
			if(p.info == x)
				break;
			p =p.link;
			
		}while(p != last.link);
		
		
		if(p == last.link && p.info != x)
			System.out.println("Element does not exists");
		else if(p == last.link && p.info == x)
			deleteFirst();
		else if(p == last && p.info == x)
			deleteLast();
		else{
			Node p2 = last.link;
			
			do{
				if(p2.link == p)
					break;
				p2 = p2.link;
			}while(p2 != last.link);
			
			p2.link = p.link;
		}
			
	}		

	public void displayList() {
		
		if(last == null){
			System.out.println("Empty List");
			return;
		}

		Node p = last.link;
		do {
			System.out.print(p.info + " ");
			p = p.link;
		} while (p != last.link);
	}

}
