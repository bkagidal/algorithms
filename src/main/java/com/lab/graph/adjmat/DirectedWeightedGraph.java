package com.lab.graph.adjmat;

public class DirectedWeightedGraph {

	private static final int MAXELMENTS=30;
	private int n;
	private int e;
	private Vertex[] vertexList;
	int[][] adj;
	
	public DirectedWeightedGraph() {
		n=0;
		e=0;
		vertexList =  new Vertex[MAXELMENTS];
		adj = new int[MAXELMENTS][MAXELMENTS];
	}
	
	public void display(){
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
				System.out.print(adj[i][j]+" ");
			System.out.println("");
		}
	}
	
	public int getVertices(){
		
		return n;
	}
	
	public int getEdges(){
		
		return e;
	}
	
	public void insertVertex(String v){
		
		vertexList[n++] = new Vertex(v);
	}

	public int getIndex(String v){
		
		for(int i=0;i<n;i++){
			if(vertexList[i].v.equals(v)){
				return i;
			}
		}
		
		throw new RuntimeException("Invalid Vertex");
	}
	
	public void insertEdge(String u,String v,int wt){
		
		int i = getIndex(u);
		int j = getIndex(v);
		
		if(adj[i][j]!=0)
			System.out.println("Edge Already Exists");
		else{
			
			adj[i][j] = wt;
			e++;
		}
			
	}
	
	public boolean edgeExists(String u,String v){
		
		int i = getIndex(u);
		int j = getIndex(v);

		return adj[i][j]!=0;

	}
	
	
	public void deleteEdge(String u,String v){
		
		int i = getIndex(u);
		int j = getIndex(v);
		
		if(adj[i][j]!=0){
			adj[i][j] = 0;
			e--;
		}
		else
			System.out.println("No Edge Exists");
		
	}
	
	public int outdegree(String v){
		
		int u = getIndex(v);
		int out =0;
		for(int i=0;i<n;i++){
			if(adj[u][i]!=0)
				out++;
		}
		
		return out;
	}
	
	public int indegree(String v){
		int u = getIndex(v);
		int in =0;
		
		for(int i=0;i<n;i++){
			if(adj[i][u]!=0)
				in++;
		}
		
		return in;
	}
}
