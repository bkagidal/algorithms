package com.lab.graph.kruskal;

public class Vertex {

	String name;
	int father;
	
	public Vertex(String name) {
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
}
