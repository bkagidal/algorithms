package com.lab.QueueArray;

import java.util.EmptyStackException;

public class Queue {
	
	int queueArray[];
	int size;
	int start=0;
	int cnt=0;
	
	Queue(){
		queueArray = new int[6];
		size=0;
	}
	
	public int size(){
		return cnt;
	}
	
	public boolean isFull(){
		return (size == (queueArray.length-1));
	}
	
	public boolean isEmpty(){
		return (size ==-1);
	}
	
	public void enqueue(int x){
		
		if(isFull()){
			System.out.println("Over Flow");
			return;
		}
		
		queueArray[size] = x;
		size++;
		cnt++;
	}

	public int dequeue(){
		
		if(isEmpty()){
			System.out.println("Queue Empty");
			throw new EmptyStackException();
		}
		
		int x = queueArray[start];
		start++;
		cnt--;
		return x;
	}
	
	public void display(){
		
		for(int i = start ;i< size;i ++){
			System.out.print(queueArray[i] + " ");
		}
	}

}
