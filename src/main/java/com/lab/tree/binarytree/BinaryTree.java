package com.lab.tree.binarytree;


public class BinaryTree{

	Node root;
	QueueA queue = new QueueA(); 
	
	public BinaryTree() {
		root = null;
	}
	
	public void display(){
		display(root,0);
		System.out.println();
	}
	
	public void display(Node p , int level){
		
		
		if(p == null)
			return;
		
		display(p.rchild, level+1);
		System.out.println(" ");
		
		for(int i=0;i<level;i++)
			System.out.print("  ");
		
		System.out.print(p.info);
		//System.out.print(" ");
		display(p.lchild, level+1);
	}
	
	
	
	public void create(){
		
		root = new Node('P');
		
		root.lchild = new Node('Q');
		root.rchild = new Node('R');
		
		root.lchild.lchild = new Node('A');
		root.lchild.rchild = new Node('B');
		
		root.rchild.lchild = new Node('X');
		
	}
	
	public void preorder(){
		
		preorder(root);
	}
	
	public void preorder(Node p){
		
		if(p == null)
			return;
		
		System.out.print(p.info+" ");
		preorder(p.lchild);
		preorder(p.rchild);
	}
	
	public void inorder(){
		inOrder(root);
	}
	
	public void inOrder(Node p){
		
		if( p == null)
			return;
		inOrder(p.lchild);
		System.out.print(p.info+" ");
		inOrder(p.rchild);
	}
	
public void postorder(){
		
		postorder(root);
	}
	
	public void postorder(Node p){
		
		if(p == null)
			return;
		
		
		postorder(p.lchild);
		postorder(p.rchild);
		System.out.print(p.info+" ");
	}
	
	public void levelorder(){
		levelorder(root);
		System.out.println();
	}
	
	public void levelorder(Node p){
		
		if(p == null)
			return;
		
		queue.enqueue(p);
		
		while(!queue.empty()){
			
			Node n = queue.dequeue();
			if(n!=null){
			System.out.print(n.info+" ");
			//Node n = new Node(ch);
			if(n.lchild!=null)
				queue.enqueue(n.lchild);
			
			if(n.rchild != null)
				queue.enqueue(n.rchild);
			}
		}
		
	}
	
	public int height(){
		
		return height(root);
	}
	
	public int height(Node p){
		
		if( p == null)
			
			return 0;
		
		int hL = height(p.lchild);
		int rL = height(p.rchild);
		
		if(hL > rL)
			return 1 + hL;
		else
			return 1 + rL;
		
		
	}
}