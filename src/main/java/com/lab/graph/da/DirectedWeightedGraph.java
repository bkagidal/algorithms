package com.lab.graph.da;

public class DirectedWeightedGraph {

	int n;
	int e;
	int adj[][];
	
	private static final int TEMPARARY = 1;
	private static final int PERMANENT = 2;
	private static final int NIL =-1;
	private static final int INFINITY = 99999;
	private static final int MAXNUMBERS = 30;
	Vertex[] vertexList;
	
	public DirectedWeightedGraph() {
		adj = new int[MAXNUMBERS][MAXNUMBERS];
		vertexList = new Vertex[MAXNUMBERS];
		n=0;
		e=0;
	}
	
	
	public void distrasTravel(String s){
		int i,cur;
		
		for(i=0;i<n;i++){
			vertexList[i].state = TEMPARARY;
			vertexList[i].pathLenght = INFINITY;
			vertexList[i].predecessor = NIL;
		}
		
		int v = getIndex(s);
		
		vertexList[v].pathLenght=0;
		
		while(true){
			
			cur = tempVerMinPL();
			
			if(cur == NIL)
				return;
			
			vertexList[cur].state = PERMANENT;
			
			for(i=0;i<n;i++){
				if(isAdj(cur, i) && vertexList[i].state == TEMPARARY){
					if(vertexList[cur].pathLenght+adj[cur][i] < vertexList[i].pathLenght){
						vertexList[i].predecessor = cur;
						vertexList[i].pathLenght = vertexList[cur].pathLenght+adj[cur][i];
					}
					
				}
			}
		}
			
	}
	
	
	public int tempVerMinPL(){
		
		int min = INFINITY;
		int x =NIL;
		
		for(int i =0;i<n;i++){
			if(vertexList[i].state == TEMPARARY && vertexList[i].pathLenght < min){
				min = vertexList[i].pathLenght;
				x=i;
			}
		}
		
		return x;
	}
	
	public void findPaths(String source){
		
		distrasTravel(source);
		
		System.out.println("Source Vertex : "+source+"\n");
		for(int v=0;v<n;v++){
			System.out.println("Destination vertex :"+ vertexList[v]);
			
			if(vertexList[v].pathLenght == INFINITY)
				System.out.println("There is no path from "+source+" to "+vertexList[v]+"\n");
			else
				findPath(getIndex(source), v);
		}
		
	}
	
	public void findPath(int s,int v){
		
		int cnt=0,u;
		int[] path = new int[n];
		int sd =0;
		
		while(v!=s){
			cnt++;
			path[cnt] = v;
			u = vertexList[v].predecessor;
			sd +=adj[u][v];
			v=u;
		}
		cnt++;
		path[cnt]=s;
		
		int j;
		System.out.print("Shotest Path is :");
		for( j=cnt;j>=1;j--)
			System.out.print(path[j]+" ");
			
		System.out.println("\nShortest Distance is :"+sd+"\n");
	}
	
	public int getVertexCount(){
		return n;
	}
	
	public int noOfEdges(){
		return e;
	}
	
	public int getIndex(String name){
		
		for(int i=0;i<n;i++){
			if(name.equals(vertexList[i].name))
				return i;
		}
		
		throw new RuntimeException("Invalid Vertex");
	}
	
	public void insertVertex(String name){
		vertexList[n++] = new Vertex(name);
	}
	
	public void insertEdge(String u,String v,int wt){
		
		int i = getIndex(u);
		int j = getIndex(v);
		
		if(adj[i][j] != 0)
			System.out.println("Edge already exists");
		else{
			adj[i][j] = wt;
			e++;
		}
	}
	
	public boolean isAdj(int u,int v){
		
		return (adj[u][v] != 0);
	}
	
	
}
