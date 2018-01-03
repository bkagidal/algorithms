package com.lab.graph.list;

public class VertexNode {
	
	String name;
	VertexNode next;
	EdgeNode firstRef;
	
	public VertexNode(String n) {
		this.name = n;
	}
	
	public String toString(){
		return name;
	}

}
