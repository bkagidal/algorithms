package com.lab.graph.list;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		LinkedDigraph g = new LinkedDigraph();
		
		Scanner scan = new Scanner(System.in);
		
		int choice,n;
		String u,v;
		
		while(true){
			System.out.println("\n");
			System.out.println("1.Display");
			System.out.println("2.Insert Vertex");
			System.out.println("3.Insert Edge");
			System.out.println("4.Delete vertex");
			System.out.println("5.Edge exists");
			System.out.println("6.Out Degree :");
			System.out.println("7.In Degree :");
			System.out.println("8.Exit..");
			System.out.println("\n");
			System.out.print("Enter Your Choice:");
			
		    choice = scan.nextInt();
		    
		    if(choice == 8)
		    	break;
		    
		    switch(choice){
		    	
		    case 1:
		    		System.out.println("\n");
		    		g.display();
		    		break;
		    case 2:
		    		System.out.print("Enter Vertex to insert:");
		    		v = scan.next();
		    		g.insertVertex(v);
		    		break;
		    case 3:
		    	    System.out.print("Enter Edge to insert :");
		    	    
		    	    u = scan.next();
		    	    v = scan.next();
		    	    g.insertEdge(u, v);
		    	    break;
		    case 4:
		    	    System.out.print("Enter Vertex to delete :");
		    	    v = scan.next();
		    	    g.deleteVertex(v);
		    	    break;
		    case 5:
		    	    System.out.println("Enter edges :");
		    	    u = scan.next();
		    	    v = scan.next();
		    	    boolean flag = g.edgeExists(u, v);
		    	    System.out.println("\n");
		    	    if(flag)
		    	    	System.out.println("Edge Exists");
		    	    else
		    	    	System.out.println("No Edge exists");
		    	    break;
		    case 6:
		    		System.out.println("Enter Vertex for Out Degree :");
		    		u = scan.next();
		    		n = g.outDegree(u);
		    		System.out.println(n);
		    		break;
		    case 7:
		    		 System.out.println("Enter Vertex for Out Degree :");
		    		 u = scan.next();
		    		 n = g.inDegree(u);
		    		System.out.println(n);	
		    		break;
		     default:
		    	 System.out.println("Wrong Choice ..");
		    	    	
		    	    
		    }
			
		}
		scan.close();
	}

}
