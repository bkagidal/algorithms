package com.lab.tree.binarytree;

@SuppressWarnings("unused")
public class Node {

	public Node lchild;
	public char info;
	public Node rchild;
	
	public Node(char ch){
		lchild = null;
		this.info = ch;
		rchild = null;
	}
}
