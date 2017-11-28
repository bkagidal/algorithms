package com.lab.tree.binarytree;

public class QueueA {
	
	Node[] queue = new Node[20];
	
	int front =-1;
	int rear =-1;
	
	int size =0;
	
	
	public boolean empty(){
		
		return size ==0;
		
	}
	
	public void enqueue(Node p){
		rear = rear+1;
		size++;
		queue[rear]=p;
	}
	
	public Node dequeue(){
		front =front+1;
		size--;
		return queue[front];
		
	}
	
	public void print(){
		for(int i=front;i<rear;i++)
			System.out.print(queue[i].info+" ");
	}
	

}
