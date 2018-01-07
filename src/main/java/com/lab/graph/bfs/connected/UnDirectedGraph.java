package com.lab.graph.bfs.connected;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class UnDirectedGraph {

	private static final int MAXELMENTS = 30;
	private int n;
	private int e;
	private Vertex[] vertexList;
	boolean[][] adj;

	private static final int INITIAL = 0;
	private static final int WAITING = 1;
	private static final int VISITED = 2;

	public UnDirectedGraph() {
		n = 0;
		e = 0;
		vertexList = new Vertex[MAXELMENTS];
		adj = new boolean[MAXELMENTS][MAXELMENTS];
	}

	public boolean isConnected() {

		for (int i = 0; i < n; i++)
			vertexList[i].state = INITIAL;

		
		int cn=0;
		cn++;
		bfs(0,cn);
		
		for(int v=0;v<n;v++){
			if(vertexList[v].state == INITIAL){
				cn++;
				bfs(v,cn);
			}
		}
		
		if(cn == 1){
			System.out.println("Graph is Connected");
			return true;
		}else{
			System.out.println("Graph is Disconnected");
			for(int v=0;v<n;v++){
				System.out.println("Vertex "+vertexList[v]+" Connected "+vertexList[v].connected);
			}
			return false;
		}

		//scan.close();
	}

	private void bfs(int v,int cn) {

		Queue<Integer> queue = new LinkedList<Integer>();

		queue.add(v);
		vertexList[v].state = WAITING;
		
		int ele;

		while (!queue.isEmpty()) {

			ele = queue.remove();

		//	System.out.print(vertexList[ele] + " ");
			vertexList[ele].state = VISITED;
			vertexList[ele].connected =cn;
			
			for (int i = 0; i < n; i++) {

				if (isAdj(ele,i) && vertexList[i].state == INITIAL){
					queue.add(i);
					vertexList[i].state = WAITING;
					
				}
			}

		}
		
		System.out.println();

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
			if (vertexList[i].name.equals(v)) {
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
			adj[j][i] = true;
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
			adj[j][i] = false;
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
