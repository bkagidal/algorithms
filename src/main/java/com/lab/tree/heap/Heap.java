package com.lab.tree.heap;

import java.util.NoSuchElementException;

public class Heap {

	private int a[];
	private int n;

	public Heap() {

		a = new int[20];
		n = 0;
		a[0]=9999;
	}

	public void insert(int data) {
		n++;
		a[n] = data;
		restoreUp(n);
	}

	public void restoreUp(int i) {

		int k = a[i];
		
		int iparent;

		iparent = i / 2;

		while (a[iparent] < k) {

			a[i] = a[iparent];
			i = iparent;
			iparent = i/ 2;
		}
		a[i] = k;
	}
	
	public int delete(){
		if(n == 0)
			throw new NoSuchElementException();
		
		int k = a[1];
		a[1] = a[n];
		n--;
		restoreDown(1);
		
		return k;
	}
	
	public void restoreDown(int i){
		
		int k = a[i];
		int lchild = 2*i;
		int rchild = lchild+1;
		
		while(rchild<=n){
			
			if(k>=a[lchild] && k>=a[rchild]){
				   a[i]=k;
				   return;
			}
			
			if(a[lchild] >= a[rchild]){
				
				a[i] = a[lchild];
				i = lchild;
			}else{
				a[i]=a[rchild];
				i = rchild;
			}
			lchild = 2*i;
			rchild = lchild+1;
		}
		
			if(lchild == n && a[lchild]<k){
				a[i]=a[lchild];
				i = lchild;
			}
			
			a[i]=k;
		
		
		
	}

		public void display(){
			for(int i=1;i<=n;i++)
				System.out.print(a[i]+" ");
		}
}
