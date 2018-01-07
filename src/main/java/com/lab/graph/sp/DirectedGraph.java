package com.lab.graph.sp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DirectedGraph {

	private static final int MAXELMENTS = 30;
	private int n;
	private int e;
	private Vertex[] vertexList;
	boolean[][] adj;

	private static final int INITIAL = 0;
	private static final int WAITING = 1;
	private static final int VISITED = 2;
	private static final int NIL = -1;
	private static final int INFINITY = 99999;
	

	public DirectedGraph() {
		n = 0;
		e = 0;
		vertexList = new Vertex[MAXELMENTS];
		adj = new boolean[MAXELMENTS][MAXELMENTS];
	}

	public void bfsTraversal() {

		for (int i = 0; i < n; i++){
			vertexList[i].state = INITIAL;
			vertexList[i].distance = INFINITY;
			vertexList[i].predecessor = NIL;
			
		}

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Vertext to Start BFS :");

		String v = scan.next();

		bfs(getIndex(v));
		
		for(int j=0;j<n;j++){
			
			if(vertexList[j].distance == INFINITY)
				System.out.println("There is no SP from "+v+" to "+vertexList[j]);
			else{
				
				System.out.println("Shortest Distance from "+v+" to "+vertexList[j]+" is :"+vertexList[j].distance);
				System.out.print("Path is :");
				
				int x;
				int cnt =0;
				int path[] = new int[n];
				
				int y=j;
				
				while(y!=-1){
					cnt++;
					path[cnt] =y;
					x= vertexList[y].predecessor;
					y =x;
				}
				int k;
				for( k=cnt;k>1;k--)
					System.out.print(path[k]+"->");
				   System.out.print(path[k]);
				   
			System.out.println("\n");	   
			}
		}

		//scan.close();
	}

	private void bfs(int v) {

		Queue<Integer> queue = new LinkedList<Integer>();

		queue.add(v);
		vertexList[v].state = WAITING;
        vertexList[v].distance = 0;
        vertexList[v].predecessor = NIL;
		int ele;

		while (!queue.isEmpty()) {

			ele = queue.remove();

			//System.out.print(vertexList[ele] + " ");
			vertexList[ele].state = VISITED;

			for (int i = 0; i < n; i++) {

				if (isAdj(ele,i) && vertexList[i].state == INITIAL){
					queue.add(i);
					vertexList[i].state = WAITING;
					vertexList[i].predecessor = ele;
					vertexList[i].distance = vertexList[ele].distance+1;
				}
			}

		}
		
		System.out.println();

	}

	public void bfsTraversal_all() {

		for (int i = 0; i < n; i++)
			vertexList[i].state = INITIAL;

		Scanner scan1 = new Scanner(System.in);
		System.out.print("Enter Vertext to Start BFS :");

		String v = scan1.next();

		bfs(getIndex(v));

		for (int j = 0; j < n; j++) {
			if (vertexList[j].state == INITIAL)
				bfs(j);
		}
		scan1.close();
	}

	public void display() {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				if (adj[i][j])
					System.out.print("1 ");
				else
					System.out.print("0 ");
			System.out.println("");
		}
	}

	public int getVertices() {

		return n;
	}

	public int getEdges() {

		return e;
	}

	public void insertVertex(String v) {

		vertexList[n++] = new Vertex(v);
	}

	public int getIndex(String v) {

		for (int i = 0; i < n; i++) {
			if (vertexList[i].toString().equals(v)) {
				return i;
			}
		}

		throw new RuntimeException("Invalid Vertex");
	}

	public void insertEdge(String u, String v) {

		int i = getIndex(u);
		int j = getIndex(v);

		if (adj[i][j])
			System.out.println("Edge Already Exists");
		else {

			adj[i][j] = true;
			e++;
		}

	}

	public boolean edgeExists(String u, String v) {

		int i = getIndex(u);
		int j = getIndex(v);

		return adj[i][j];

	}

	public boolean isAdj(int i, int j) {

		return adj[i][j];
	}

	public void deleteEdge(String u, String v) {

		int i = getIndex(u);
		int j = getIndex(v);

		if (adj[i][j]) {
			adj[i][j] = false;
			e--;
		} else
			System.out.println("No Edge Exists");

	}

	public int outdegree(String v) {

		int u = getIndex(v);
		int out = 0;
		for (int i = 0; i < n; i++) {
			if (adj[u][i])
				out++;
		}

		return out;
	}

	public int indegree(String v) {
		int u = getIndex(v);
		int in = 0;

		for (int i = 0; i < n; i++) {
			if (adj[i][u])
				in++;
		}

		return in;
	}
}
