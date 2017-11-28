package com.lab.tree.bst;

public class BinarySearchTree {

	Node root;

	public BinarySearchTree() {
		root = null;
	}

	public void insert(int x) {

		Node p = root;
		Node parent = null;

		if (p == null) {

			root = new Node(x);
			return;
		}

		while (p != null) {

			parent = p;

			if (x < p.info)
				p = p.lchild;
			else if (x > p.info)
				p = p.rchild;
			else {
				System.out.println("Element already exists");
				return;
			}

		}

		if (x > parent.info)
			parent.rchild = new Node(x);
		else
			parent.lchild = new Node(x);

	}

	public void insert1(int x) {
		root = insert1(root, x);
	}

	public Node insert1(Node p, int x) {

		if (p == null)
			p = new Node(x);
		else if (x < p.info)
			p.lchild = insert1(p.lchild, x);
		else if (x > p.info)
			p.rchild = insert1(p.rchild, x);
		else
			System.out.println("Element Already exists");

		return p;
	}

	public void display() {
		display(root, 0);
		System.out.println();
	}

	public void search(int x) {

		Node p = root;

		while (p != null) {

			if (x < p.info)
				p = p.lchild;
			else if (x > p.info)
				p = p.rchild;
			else {
				System.out.println("Element " + x + " found in tree");
				return;
			}
		}

		if (p == null)
			System.out.println("Element Not Found in Tree");
	}

	public boolean search1(int x) {

		return (search1(root, x) != null);
	}

	public Node search1(Node p, int x) {

		if (p == null)
			return null;

		if (x < p.info)
			return search1(p.lchild, x);
		else if (x > p.info)
			return search1(p.rchild, x);

		return p;
	}

	public int min() {

		Node p = root;

		while (p.lchild != null)
			p = p.lchild;

		return p.info;
	}

	public int max() {
		Node p = root;

		while (p.rchild != null)
			p = p.rchild;

		return p.info;
	}

	public int min1() {
		return min1(root).info;
	}

	public Node min1(Node p) {

		if (p.lchild == null)
			return p;

		return min1(p.lchild);
	}

	public int max1() {

		return max1(root).info;
	}

	public Node max1(Node p) {
		if (p.rchild == null)
			return p;

		return max1(p.rchild);
	}

	public void display(Node p, int level) {

		if (p == null)
			return;

		display(p.rchild, level + 1);
		System.out.println("");

		for (int i = 0; i < level; i++)
			System.out.print("   ");

		System.out.println(p.info);

		display(p.lchild, level + 1);
	}
	
	
	public void delete(int x){
		
		Node par=null,p;
		
		p = root;
		
		while(p != null){
			
			if(p.info == x)
				break;
			par = p;
			
			if( x < p.info)
				p = p.lchild;
			else
				p = p.rchild;
		}
		
		
		if(p == null){
			System.out.println("Element Not Found");
			return;
		}
			
		if(p.lchild != null && p.rchild != null){
			
			Node ps,s;
			ps = p;
			s = p.rchild;
			
			while(s.lchild != null){
				ps =s;
				s = s.lchild;
			}
			
			p.info = s.info;
			
			par =ps;
			p = s;
		}
			
		
		Node ch;
		
		if(p.lchild != null)
			ch =p.lchild;
		else
			ch = p.rchild;
		
		if(par == null)
			root=ch;
		else if(par.lchild == p)
			par.lchild =ch;
		else
			par.rchild =ch;
		
	}
	
	
	public Node delete1(Node p,int x){
		
		Node ch;
		if( p == null){
			
			System.out.println("Tree is Empty");
			return null;
		}
			
		
		if(x < p.lchild.info)
			p.lchild = delete1(p.lchild,x);
		else if(x > p.rchild.info)
			p.rchild = delete1(p.rchild,x);
		else{
			
			if(p.lchild != null && p.rchild != null){
				
				Node s;
				s=p.rchild;
				while(s.lchild != null)
					s = s.lchild;
				
				p.info = s.info;
				p.rchild = delete1(p.rchild,s.info);
				
			}else{
				if(p.lchild != null)
					ch = p.lchild;
				else
					ch = p.rchild;
				
				p = ch;
			}
				
			
		}
		return null;
	}
	
	
}
