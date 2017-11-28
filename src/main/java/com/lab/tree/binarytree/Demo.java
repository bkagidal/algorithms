package com.lab.tree.binarytree;

public class Demo{
	
	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.create();
		
		tree.display();
		System.out.print("Pre Order  : ");
		tree.preorder();
		
		System.out.println();
		System.out.print("In Order   : ");
		tree.inorder();
		
		System.out.println();
		System.out.print("Post Order : ");
		tree.postorder();
		
		System.out.println();
		System.out.print("Level Order : ");
		tree.levelorder();
		
		System.out.println();
		System.out.print("Height Of Tree :");
		System.out.println(tree.height());
	}
	
}