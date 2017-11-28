package com.lab.priorityQueue;

public class Node {

	int info;
	int priority;
	Node link;
	
	public Node(int i,int pri) {
		
		this.info = i;
		this.priority = pri;
		this.link = null;
	}
}
