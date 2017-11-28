package com.lab.doubleLinkedList;

import java.util.Scanner;

public class DoubleLinkedList {
	
	Node start;
	
	public DoubleLinkedList() {
		start = null;
	}

	public void displayList(){
		Node p =start;
		
		while(p!=null){
			System.out.print(p.info +" ");
			p=p.next;
		}
	}
	
	
	public void createList(){
		
		System.out.print("Enter No Of Nodes : ");
		
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
		Node node = null;
		Node temp,p=null;
		
		for(int i=0;i<n;i++){
		
			System.out.print("Enter Node : ");
			int x = scan.nextInt();
			
			if(node == null){
				node = new Node(x);
			    start= node;
			    p=node;
			}
			else{
				 
				 temp = new Node(x);
				 p.next = temp;
				 temp.prev=p;
				 
				 p = temp;
				
			}
			
			//System.out.print("\n");
			
		}
	}
	
	
	public int countNodes(){
		Node p = start;
		int cnt=0;
		
		while(p != null){
			cnt++;
			p = p.next;
		}
		return cnt;
	}
	
	public void searchElement(int x){
		
		Node p=start;
		int cnt=0;
		
		while(p!=null){
			cnt++;
			if(p.info == x)
				break;
			p=p.next;
		}
		
		if(p==null)
			System.out.println("\nElement Not Found");
		else
			System.out.println("\nElement found at position : "+cnt);
	}
	
	
	public void insertAtBegining(int x){
		
		Node temp;
		
		temp = new Node(x);
		
		if(start == null){
			start = temp;
		}else{
			
			temp.next =start;
			start.prev = temp;
			start = temp;
		}
		
			
	}
	
	public void insertAtEnd(int x){
		
		Node p = start;
		Node temp;
		
		temp = new Node(x);
		
		if(p == null){
			start = temp;
		}else{
			while(p.next != null){
				p=p.next;
			}
			
			p.next = temp;
			temp.prev = p;
			
		}
			
	}
	
	public void insertAfterNode(int x,int y){
		
		Node p =start;
		
		while(p != null){
			if(p.info == x)
				break;
			p=p.next;
		}
		
		Node temp = new Node(y);
		if(p.next != null){
			temp.next = p.next;
			temp.prev = p;
			temp.next.prev = temp;
			p.next = temp;
		}else{
			p.next = temp;
			temp.prev = p;
		}
		
		
	}
	
	public void insertBeforeNode(int x, int y){
		
		Node p = start;
		
		while(p!= null){
			if(p.info == x)
				break;
			p = p.next;
		}
		
		Node temp = new Node(y);
		
		if(p.prev != null){
			temp.prev = p.prev;
			p.prev.next = temp;
			
			temp.next = p;
			p.prev = temp;
		}else{
			p.prev = temp;
			temp.next = p;
			start = temp;
		}
		
	}
	
	public void insertNodeAtpos(int x,int y){
		
		Node p = start;
		int i;
		for( i=1;i<=x;i++){
			
			if(i == x)
				break;
			p=p.next;
		}
		
		Node temp = new Node(y);
		
		if(p.next == null && i!=x){
			p.next = temp;
			temp.prev = p;
		}else if(p.prev == null){
			temp.next = p;
			p.prev = temp;
			start = temp;
			
		}else{
			temp.prev =p.prev;
			p.prev.next = temp;
			temp.next = p;
			
			p.prev = temp;
			
			
		}
			
	}
	
	public void deleteFirstNode(){
		
		if(start == null){
			System.out.println("List is Empty");
			return;
		}
		
		if ( start.next == null)
		{
			start =null;
			return;
		
		}
		
		start = start.next;
		
		start.prev = null;
			
	}
	
	public void deleteLastNode(){
		if(start == null){
			System.out.println("List is Empty");
			return;
		}
		
		if ( start.next == null)
		{
			start =null;
			return;
		
		}
		
		Node p = start;
		while(p.next != null){
			p = p.next;
		}
		
		p.prev.next = null;
		
	}
	
	public void deleteNode(int x){
		
		if(start == null){
			System.out.println("List is Empty");
			return;
		}
		
		if ( start.next == null)
		{
			if(start.info != x){
				System.out.println("Node Not Found");
				return;
			}else{
				start = null;
			return;
			}
		
		}
		
		Node p = start;
		
		while(p != null){
			
			if(p.info ==x){
				break;
			}
			p = p.next;
		}
		
		if(p == null)
			System.out.println("Node Not present");
		else if(p.next == null){
			p.prev.next = p.next;
			//p.next.prev = p.prev;
		}else if(p.prev == null){
			p.next.prev = null;
			start = p.next;
		}else{
			p.prev.next = p.next;
			p.next.prev = p.prev;
		}
		
	}
	
	public void reverseList(){
		Node p1 = start;
		Node p2 = p1.next;
		
		p1.next = null;
		p1.prev = p2;
		
		while(p2!= null){
			
			p2.prev = p2.next;
			p2.next = p1;
			p1=p2;
			p2 = p2.prev;
		}
		
		start = p1;
	}
}
