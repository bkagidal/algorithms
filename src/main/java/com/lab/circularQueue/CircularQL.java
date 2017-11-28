package com.lab.circularQueue;

public class CircularQL {
	
	Node rear;
	int cnt;
	public CircularQL(){
		rear = null;
		
		cnt =0;
	}
	
	public boolean isEmpty(){
		return rear == null;
	}
	
	public int size(){
		return cnt;
	}
	
	public void enQueue(int i){
		
		Node temp = new Node(i);
		
		if(rear == null){
			rear = temp;
			rear.link = temp;
			cnt++;
			return;
		}
		
		temp.link = rear.link;
		rear.link = temp;
		rear = temp;
		cnt++;
		
	}
	
	public void deQueue(){
		
		if(rear == null){
			System.out.println("\nQueue is Empty");
			return;
		}
		
		if(rear.link == rear){
			System.out.println(rear.info);
			rear =null;
			cnt =0;
			return;
		}
		
		int ele = rear.link.info;
		rear.link = rear.link.link;
		System.out.println(ele);
		cnt--;
		
	}
	
	public void displayFirst(){
		if(rear != null)
		System.out.println(rear.link.info);
	}
	
	public void display(){
		if(rear == null){
			System.out.println("Queue is Empty");
			return;
		}
		Node p = rear.link;
		
		do{
			System.out.print(p.info+" ");
			p = p.link;
		}while(p != rear.link);
	}

}
