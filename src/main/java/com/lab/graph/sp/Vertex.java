package com.lab.graph.sp;

public class Vertex {
	
	String name;
	int state;
	int distance;
	int predecessor;
	
	Vertex(String name){
		this.name = name;
	}
	
	public String toString(){
		return name;
	}

}
