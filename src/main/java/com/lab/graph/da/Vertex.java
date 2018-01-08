package com.lab.graph.da;

public class Vertex {
	
	String name;
	int state;
	int pathLenght;
	int predecessor;
	
	public Vertex(String name) {
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
}
