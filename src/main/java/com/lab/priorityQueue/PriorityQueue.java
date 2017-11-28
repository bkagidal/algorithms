package com.lab.priorityQueue;

public class PriorityQueue {
	
	Node start;
	
	public PriorityQueue() {
		start = null;
	}
	
	
	public boolean isEmpty(){
		return start == null;
	}
	
	public void insert(int data,int pri){
		
		Node temp = new Node(data,pri);
		
		if(start == null){
			start = temp;
		}else{
		
			Node p = start;
			Node prev = start;
			
			while(p != null){
				
				if(temp.priority <= p.priority )
					break;
				
				prev=p;
				p = p.link;
			}
			
			if(p == start){
				temp.link = p;
				start = temp;
				
			}else if( p!=null){
				temp.link = prev.link;
				prev.link =temp;
			}else{
				prev.link = temp;
			}
			
		}
			
	}
	
	public void delete(){
		
		if(isEmpty()){
			System.out.println("\n Queue is Empty");
			return;
			
		}
		
		int ele = start.info;
		start = start.link;
		System.out.println("\nDeleted :"+ele);
	}
	
	public void display(){
		
		if(isEmpty()){
			System.out.println("\nQueue is Empty");
			return;
		}
		
		Node p = start;
		
		while(p != null){
			System.out.print(p.priority+"|"+p.info+"  ");
			p = p.link;
		}
	}
	
	
}
