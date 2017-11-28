package com.lab.stackArray;

import java.util.EmptyStackException;

public class Stack {
	
	int stackArray[];
	int top;
	
	Stack(){
		stackArray = new int[6];
		top = -1;
	}
	
	Stack(int size){
		stackArray = new int[size];
		top=-1;
	}
	
	public int size(){
		
		return top+1;
	}
	
	public boolean isEmpty(){
		
		return (top ==-1);
	}
	
	public boolean isFull(){
		
		return (top == (stackArray.length-1));
	}
	
	public void push(int x){
		
		if(isFull()){
			System.out.println("Stack Is Overflow");
			return;
		}
		
		top = top+1;
		stackArray[top]=x;
	}
	
	public int pop(){
		
		if(isEmpty()){
			System.out.println(" Stack is Empty");
			throw new EmptyStackException();
		}
		int x=stackArray[top];
		top = top-1;
		return x;
	}
	
	public int peek(){
		
		if(isEmpty()){
			System.out.println(" Stack is Empty");
			throw new EmptyStackException();
		}
		
		return stackArray[top];
	}
	
	public void display(){
		
		if(isEmpty()){
			System.out.println("Stack Empty");
			return;
		}
		
		for(int i=top;i>=0;i--){
			System.out.println(stackArray[i]);
		}
	}

}
