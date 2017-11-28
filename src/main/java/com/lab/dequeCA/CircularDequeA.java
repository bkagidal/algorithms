package com.lab.dequeCA;

public class CircularDequeA {
	
	int  dequeArray[];
	int front;
	int rear;
	int cnt;
	
	public CircularDequeA() {
		dequeArray = new int[6];
		front =-1;
		rear = -1;
		cnt=0;
	}
	
	public CircularDequeA(int maxSize) {
		dequeArray = new int[maxSize];
		front =-1;
		rear = -1;
		cnt=0;
	}
	
	public boolean isFull(){
		return (cnt == dequeArray.length);
	}
	
	
	public void insertAtF(int i){
		
		if(isFull()){
			System.out.println("Overflow...");
			return;
		}
		
		
		if(front == 0 || front ==-1){
			front = dequeArray.length-1;
			dequeArray[front] =i;
			//rear=0;
		}else{
			front = front-1;
			dequeArray[front]=i;
		}
		cnt++;
			
	}
	
	public void insertAtR(int i){
		
		if(isFull()){
			System.out.println("Overflow...");
			return;
		}
		if(rear == -1 && front ==-1){
			rear = rear+1;
			dequeArray[rear] =i;
			front =0;
		}else if(rear == (dequeArray.length-1)){
			rear =0;
			dequeArray[rear]=i;
		}else{
			rear = rear+1;
			dequeArray[rear]=i;
		}
			
		cnt++;
		
	}
	
	public int size(){
		return cnt;
	}
	
	public boolean isEmpty(){
		return cnt <= 0;
	}
	
	public void deleteFromF(){
	
		if(isEmpty()){
			System.out.println("\nQueue is Empty.");
			return;
		}
		
		int ele;
		
		if(front == dequeArray.length-1){
			ele = dequeArray[front];
			front =0;
		}else if(front == rear){
			ele = dequeArray[front];
			front =-1;
			rear =-1;
		}
		else{
			ele = dequeArray[front];
			front = front+1;
		}
		cnt--;
		
		System.out.println("\n"+ele);
	}
	
	
	public void deleteFronR(){
		
		if(isEmpty()){
			System.out.println("\nQueue is Empty.");
			return;
		}
		
		int ele;
		
		if(rear == 0){
			ele = dequeArray[rear];
			rear = dequeArray.length-1;
		}else{
			ele = dequeArray[rear];
			rear = rear-1;
		}
		
		cnt--;
		System.out.println("\n"+ele);
		
		
	}
	
	
	public void display(){
		
		if(cnt ==0){
			System.out.println("\nEmpty Queue");
			return;
		}
		
		System.out.println("\n");
		
		if(front > rear){
			for(int i = front;i<=dequeArray.length-1;i++)
				System.out.print(dequeArray[i]+" ");
			for(int j=0;j<= rear;j++)
				System.out.print(dequeArray[j]+" ");	
		}else{
			
			for(int k=front;k<=rear;k++){
				System.out.print(dequeArray[k]+" ");
			}
		}
		
	}
	
	
	

}
