package com.lab.postfix;

public class StackInt {
	
	int stackArray[];
	int top;
	
	public StackInt() {
		stackArray = new int[20];
		top=-1;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public void push(int val){
		top = top+1;
		stackArray[top]=val;
	}
	
	public int pop(){
		
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return -1;
		}
		
		return stackArray[top--];
			
	}
	
	public int peek(){
		
		return stackArray[top];
	}

}
