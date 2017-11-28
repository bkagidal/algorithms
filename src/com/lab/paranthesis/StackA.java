package com.lab.paranthesis;

public class StackA {
	
	char stackArray[];
	int top;
	
	public StackA() {
		stackArray = new char[10];
		top = -1;
	}
	
	public boolean isEmpty(){
		return top ==-1;
	}
	
	public void push(char ch){
		
		top = top+1;
		stackArray[top]=ch;
	}
	
	public int pop(){
		int ch=-1;
		
		if(!isEmpty()){
			
			ch = stackArray[top];
			top--;
		}
		
		return ch;
			
	}

}
