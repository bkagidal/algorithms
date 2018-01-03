package com.lab.graph.adjmat;

public class Demo1DirectedGraph {

	public static void main(String[] args) {
		
		DirectedGraph graph = new DirectedGraph();
	
		graph.insertVertex("Zero");
		graph.insertVertex("One");
		graph.insertVertex("Two");
		
		graph.insertEdge("One", "Two");
		graph.insertEdge("Two", "Zero");
		
		graph.display();
		
		System.out.println("\nVertices = "+graph.getVertices()+", Edges = "+graph.getEdges());
	}
	

}
