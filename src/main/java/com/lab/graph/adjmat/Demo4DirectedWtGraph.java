package com.lab.graph.adjmat;

public class Demo4DirectedWtGraph {

	public static void main(String[] args) {
		
		DirectedWeightedGraph graph = new DirectedWeightedGraph();
	
		graph.insertVertex("Zero");
		graph.insertVertex("One");
		graph.insertVertex("Two");
		
		graph.insertEdge("One", "Two",3);
		graph.insertEdge("Two", "Zero",2);
		
		graph.display();
		
		System.out.println("\nVertices = "+graph.getVertices()+", Edges = "+graph.getEdges());
	}
	

}
