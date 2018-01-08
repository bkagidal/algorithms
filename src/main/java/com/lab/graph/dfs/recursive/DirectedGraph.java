package com.lab.graph.dfs.recursive;

import java.util.Scanner;
import java.util.Stack;

public class DirectedGraph {

	private static final int MAXELMENTS = 30;
	private int n;
	private int e;
	private Vertex[] vertexList;
	boolean[][] adj;

	private static final int INITIAL = 0;
	private static final int VISITED = 1;
	private static final int FINISHED = 2;

	public DirectedGraph() {
		n = 0;
		e = 0;
		vertexList = new Vertex[MAXELMENTS];
		adj = new boolean[MAXELMENTS][MAXELMENTS];
	}

	public void dfsTraversal() {

		for (int i = 0; i < n; i++)
			vertexList[i].state = INITIAL;

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Vertext to Start BFS :");

		String v = scan.next();

		dfs(getIndex(v));

		//scan.close();
	}

	private void dfs(int v) {


		System.out.print(v+" ");
		vertexList[v].state = VISITED;
		
		for(int i=0;i<n;i++){
			if(isAdj(v, i) && vertexList[i].state == INITIAL)
				dfs(i);
		}
		vertexList[v].state = FINISHED;
	}

	public void dfsTraversal_all() {

		for (int i = 0; i < n; i++)
			vertexList[i].state = INITIAL;

		Scanner scan1 = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter Vertext to Start DFS :");

		String v = scan1.next();

		dfs(getIndex(v));

		for (int j = 0; j < n; j++) {
			if (vertexList[j].state == INITIAL)
				dfs(j);
		}
		//scan1.close();
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
