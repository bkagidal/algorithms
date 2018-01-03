package com.lab.graph.adjmat;

import java.util.Scanner;

public class Demo2DirectedGraph {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DirectedGraph g = new DirectedGraph();
		
		int choice;
		
		while(true){
			System.out.println("\n");
			System.out.println("1.Display Adjacency Matrix");
			System.out.println("2.Insert Vertex");
			System.out.println("3.Insert an Edge");
			System.out.println("4.Delete an Edge");
			System.out.println("5.Display In Degree and Out Degree");
			System.out.println("6.Check if Edge Exists");
			System.out.println("7.Exist..");
			
			System.out.print("\nEnter Your Choice :");
			
			choice = scan.nextInt();
			
			if(choice == 7)
				break;
			
			switch(choice){
			
			case 1:
					System.out.println("\n");
					g.display();
					System.out.println("Verices :"+g.getVertices()+", Edges :"+g.getEdges());
					break;
			case 2:
				    System.out.print("Enter Vertex :");
				    String v = scan.next();
				    g.insertVertex(v);
				    break;
			case 3:
					System.out.print("Enter Edge for vetices :");
					String u = scan.next();;
					String v1 = scan.next();;
					g.insertEdge(u, v1);
					break;
			case 4:
				    System.out.print("Delete Edge for vertices :");
				    String u2 = scan.next();
				    String v2 = scan.next();
				    g.deleteEdge(u2, v2);
				    break;
			case 5:
					String v3 = scan.next();
				    System.out.print("\nIn Degree :"+g.indegree(v3)+" Out Degree :"+g.outdegree(v3));
				    break;
			case 6:
				 	System.out.print("Check if Edge Exists :");
				    String u3 = scan.next();
				    String v4 = scan.next();
				    g.edgeExists(u3, v4);
				    break;
			 default:
			       System.out.println("Wrong Choice :");	
			}
		}
		
		scan.close();
	}
	
}
