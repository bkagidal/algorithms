package com.lab.tree.heap;

public class Heap {
	
	private int a[];
	private int n;
	
	public Heap() {

		a = new int[20];
		n=0;
	}
	
	public void  insert(int data){
		n++;
		a[n]= data;
		restoreUp(a[n]);
	}
	
	public void restoreUp(int data){
		
		int iparent;
		
		iparent = n/2;
		
		while(a[iparent] < data){
		
			a[n] = a[iparent];
			n = iparent;
			iparent = iparent/2;
		}
		a[iparent] =data;
	}

}
