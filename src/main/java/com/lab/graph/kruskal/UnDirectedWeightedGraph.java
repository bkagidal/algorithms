package com.lab.graph.kruskal;

import java.util.PriorityQueue;

public class UnDirectedWeightedGraph {

	int n;
	int e;
	int[][] adj;
	Vertex[] vertexList;
	
	private static final int MAXNUMS=30;
	private static final int NIL=-1;
	
	public UnDirectedWeightedGraph() {
		vertexList = new Vertex[MAXNUMS];
		adj = new int[MAXNUMS][MAXNUMS];
	}
	
	
	public int noOfVertices(){
		return n;
	}
	
	public int noOfEdges(){
		return e;
	}
	
	public void insertVertex(String v){
		vertexList[n++] = new Vertex(v);
	}
	
	public int getIndex(String name){
		
		for(int v=0;v < n;v++){
			if(vertexList[v].name.equals(name))
				return v;
		}
		
		throw new RuntimeException("Invalid Vertex");
	}
	
	public void insertEdge(String u,String v,int wt){
		
		int i = getIndex(u);
		int j = getIndex(v);
		
		if(adj[i][j] !=0){
			System.out.println("Edge Already Exists");
		}else{
			
			adj[i][j] = wt;
			adj[j][i] = wt;
			e++;
		}
		
	}
	
	public boolean isAdj(int u,int v){
		
		return adj[u][v] !=0;
	}
	
	
	public void kruskal(){
		
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		
		int u,v;
		
		for(u=0;u<n;u++){
			for(v=0;v<n;v++){
				if(adj[u][v] !=0)
					pq.add(new Edge(u,v,adj[u][v]));
			}
		}
		
		
		for(v=0;v<n;v++)
			vertexList[v].father = NIL;
		
		int v1,v2,r1=NIL,r2=NIL;
		int edgesInTree=0;
		int wtTree=0;
		
		while(!pq.isEmpty() && edgesInTree<n-1){
			
			Edge e = pq.remove();
			
			v1 = e.u;
			v2 = e.v;
			
			v=v1;
			while(vertexList[v].father != NIL)
				v = vertexList[v].father;
			
			r1=v;
			
			v=v2;
			while(vertexList[v].father != NIL)
				v = vertexList[v].father;
			
			r2 =v;
			
			if(r1!=r2){
				
				System.out.println("("+vertexList[v2]+","+vertexList[v1]+")");
				edgesInTree++;
				wtTree+=adj[v1][v2];
				vertexList[r2].father = r1;
			}
		}
		
		if(edgesInTree < n-1)
			throw new RuntimeException("Graph is not connected");
		
		System.out.println("Weight of min span Tree :"+wtTree);
	}
}
