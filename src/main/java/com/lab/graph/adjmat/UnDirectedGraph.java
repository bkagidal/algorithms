package com.lab.graph.adjmat;

public class UnDirectedGraph {

	private static final int MAXELMENTS = 30;
	private int n;
	private int e;
	private Vertex[] vertexList;
	boolean[][] adj;

	public UnDirectedGraph() {
		n = 0;
		e = 0;
		vertexList = new Vertex[MAXELMENTS];
		adj = new boolean[MAXELMENTS][MAXELMENTS];
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
			if (vertexList[i].v.equals(v)) {
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

	public int degree(String v) {

		int u = getIndex(v);
		int deg = 0;
		for (int i = 0; i < n; i++) {
			if (adj[u][i])
				deg++;
		}

		return deg;
	}

}
