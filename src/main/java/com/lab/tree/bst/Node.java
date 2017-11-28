package com.lab.tree.bst;

public class Node {

	public Node lchild;
	public int info;
	public Node rchild;
	
	Node(int value){
		this.lchild = null;
		this.info = value;
		this.rchild = null;
	}
	
}
