package com.lab.QueueList;

public class QueueList {
	
	Node front;
	Node rear;
	int cnt;
	public QueueList() {
		front = null;
		rear = null;
	}
	
	public boolean isEmpty(){
		return (front == null && rear == null);
	}
	
	public void enQueue(int i){
		
		Node temp = new Node(i);
		
		if(isEmpty()){
			front = temp;
			rear = temp;
		}else{
			rear.link = temp;
			rear = temp;
		}
		cnt++;
	}
	
	public void displayFirst(){
		if(front != null)
			System.out.println(front.info);
	}
	
	public void deQueue(){
		
		if(front == null)
			System.out.println("Queue is empty");
		else if(front!=rear){
			int ele = front.info;
			front = front.link;
			cnt--;
			System.out.println(ele);
		}
		else if(front == rear){
			int ele = front.info;
			front = front.link;
			cnt=0;
			System.out.println(ele);
			rear = null;
		}
	}
	
	public int size(){
		return cnt;
	}
	
	public void display(){
		
		Node p = front;
		
		while(p != null){
			System.out.print(p.info + " ");
			p = p.link;
		}
	}
	
	

}
