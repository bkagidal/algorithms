package com.lab.graph.bfs.connected;

public class Vertex {
	String name;
	int connected;
	int state;
	
	public Vertex(String name) {
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
}
