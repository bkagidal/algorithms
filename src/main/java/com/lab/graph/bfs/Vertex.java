package com.lab.graph.bfs;

public class Vertex {

	 String v;
	 int state;
	
	public Vertex(String v) {
		this.v=v;
	}
	
	public String toString(){
		return v;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	
}