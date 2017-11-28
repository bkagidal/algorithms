package com.lab.stackList;

import java.util.EmptyStackException;

public class StackL {

	Node top;
	
	StackL(){
		top = null;
	}
	
	public boolean isEmpty(){
		return (top == null);
	}
	
	public void push(int x){
		
		Node temp = new Node(x);
		
		if(top == null){
			top = temp;
			return;
		}
		
		temp.link = top;
		top=temp;
	}
	
	public int pop(){
		
		if(isEmpty()){
			System.out.println("Stack Empty");
			throw new EmptyStackException();
		}
		
		int x = top.info;
		
		top = top.link;
		
		return x;
	}
	
	public int peek(){
		
		if(isEmpty()){
			System.out.println("Stack Empty");
			throw new EmptyStackException();
		}
		
		return top.info;
	}
	
	public int size(){
		
		Node p = top;
		int cnt =1;
		while(p != null){
			cnt++;
			p = p.link;
		}
		
		return cnt;
		
	}
	
	public void display(){
		
		if(isEmpty()){
			System.out.println("Empty List");
			return;
		}
		Node p =top;
		while(p!=null){
			System.out.println(p.info);
			p = p.link;
		}
	}

}
