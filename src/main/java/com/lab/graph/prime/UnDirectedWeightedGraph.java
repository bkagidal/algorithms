package com.lab.graph.prime;

public class UnDirectedWeightedGraph {

	int n;
	int e;
	int[][] adj;
	Vertex[] vertexList;
	
	private static final int MAXNUMS=30;
	private static final int TEMPARARY=1;
	private static final int PERMANANT=2;
	private static final int NIL=-1;
	private static final int INFINITY=9999;
	
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
	
	
	public void primeTravel(){
		
		int v,cur;
		int se=0;
		int wtsp=0;
		
		for(v=0;v<n;v++){
			vertexList[v].state = TEMPARARY;
			vertexList[v].pathLenght = INFINITY;
			vertexList[v].predecessor = NIL;
		}
		
		int s=0;
		
		vertexList[s].pathLenght =0;
		
		
		while(true){
			
			cur = tempararyMinPL();
			
			if(cur == NIL){
				if(se == n-1){
					System.out.println("Weight of min Spanning tree :"+wtsp);
					return;
				}
				else{
					throw new RuntimeException("Graph is not connected");
				}
			}
			
			vertexList[cur].state = PERMANANT;
			
			
			if(cur!=s){
				se++;
				System.out.println("Edge :("+vertexList[cur].predecessor+","+cur+")");
				wtsp+= adj[vertexList[cur].predecessor][cur];
			}
			
			for( v=0;v<n;v++){
				if(isAdj(cur,v) && vertexList[v].state == TEMPARARY){
					if(adj[cur][v] < vertexList[v].pathLenght){
						vertexList[v].pathLenght = adj[cur][v];
						vertexList[v].predecessor = cur;
						
					}
						
				}
			}
		}
	}
	
	public int tempararyMinPL(){
		
		int min = INFINITY;
		int x = NIL;
		
		for(int v=0;v<n;v++){
			
			if(vertexList[v].state == TEMPARARY && vertexList[v].pathLenght < min){
				min = vertexList[v].pathLenght;
				x =v;
			}
		}
		return x;
		
	}
	
}
