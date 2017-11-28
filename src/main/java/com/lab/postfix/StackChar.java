package com.lab.postfix;

public class StackChar {
	
	char stackArray[];
	int top;
	
	public StackChar() {
		stackArray = new char[20];
		top=-1;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public void push(char ch){
		top = top+1;
		stackArray[top]=ch;
	}
	
	public char pop(){
		
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return ' ';
		}
		
		return stackArray[top--];
			
	}
	
	public char peek(){
		
		return stackArray[top];
	}

}
