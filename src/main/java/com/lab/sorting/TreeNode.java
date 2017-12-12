package com.lab.sorting;

public class TreeNode {
	
	Node root = null;
	int a[] = null;
	
	public TreeNode(){
		
	}
	
	
	public TreeNode(int n){
		a = new int[n];
	}
	
	public void insert(int x){
		root = insert(root,x);
	}
	
	public Node insert(Node p,int x){
		
		if(p == null)
			p = new Node(x);
		else if(x<p.info)
			p.lchild = insert(p.lchild,x);
		else if(x > p.info)
			p.rchild = insert(p.rchild,x);
		else
			System.out.println("Element existes");
		return p;
	}
	
	
	public void inorder(){
		inorder(root);
	}
	
	int x=0;
	public void inorder(Node p){
		
		if(p == null){
			//System.out.println("Empty Tree");
			return;
		}
		
		inorder(p.lchild);
		a[x++] = p.info;
		inorder(p.rchild);
		
	}
	
	public void print(){
		inorder(root);
		print(a);
	}
	public void print(int a[]){
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

}
