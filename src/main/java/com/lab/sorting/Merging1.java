package com.lab.sorting;

public class Merging1 {

	
	public static  void merge(int a[],int i,int j,int k,int l,int b[]){
		
		int m=0;
		
		while(i<=j-1 &&  k<=l-1 ){
			
			if(a[i]<a[k])
				b[m++] = a[i++];
			else
				b[m++]= a[k++];
		}
		
		while(i<=j-1)
			b[m++] = a[i++];
		
		while(k<=l-1)
			b[m++] = a[k++];
		
	}
	public static void main(String[] args) {
		
		int a[]={2,6,9,13,1,4,5,12,20};
		
		int len = a.length;
		int temp[] = new int[a.length];
		merge(a,0,4,5,len,temp);
		
		System.out.println("\n");
		for(int i = 0;i<len-1;i++)
			System.out.print(temp[i]+" ");
	}

}
