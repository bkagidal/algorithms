package com.lab.singleLinkedList;

import java.util.Scanner;

public class SingleLinkedList {

	private Node start;

	public SingleLinkedList() {
		start = null;
	}

	public void displayList() {
		Node p;

		if (start == null) {
			System.out.println("List is Empty");
			return;
		}

		p = start;
		while (p != null) {
			System.out.print(p.info + " ");
			p = p.link;
		}
	}

	public void createList() {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number of Nodes :");

		int k = scan.nextInt();

		int data;
		Node node, p = null;

		for (int i = 0; i < k; i++) {
			System.out.print("Enter Node data :");
			data = scan.nextInt();
			node = new Node(data);
			if (start == null) {
				start = node;
				p = start;
			} else {
				p.link = node;
				p = p.link;
			}
			System.out.println("");
		}

		// scan.close();
	}

	public int countNoofNodes() {

		int cnt = 0;
		Node p = start;

		while (p != null) {
			cnt++;
			p = p.link;
		}

		return cnt;
	}

	public void SearchForElement(int x) {

		Node p = start;
		int pos = 0;
		while (p != null) {

			pos++;

			if (p.info == x) {
				break;
			}

			p = p.link;
		}

		if (p == null)
			System.out.println("\nElement " + x + " not found");
		else
			System.out.println("\nElement " + x + " found at position " + pos);
	}

	public void insertAtBegin(int x) {

		Node temp = new Node(x);

		if (start == null) {
			start = temp;
			return;
		}

		temp.link = start;
		start = temp;
	}

	public void insertAtEnd(int x) {

		Node temp = new Node(x);
		Node p = null;

		if (start == null) {
			start = temp;
			return;
		}

		p = start;

		while (p.link != null) {
			p = p.link;
		}

		p.link = temp;

	}

	public void insertAfterNode(int node, int data) {

		Node temp = new Node(data);
		Node p = null;

		if (start == null) {
			start = temp;
			return;
		}

		p = start;

		while (p != null) {

			if (p.info == node)
				break;
			p = p.link;
		}

		if (p == null)
			System.out.println(node + " not found in the list");
		else {
			temp.link = p.link;
			p.link = temp;
		}
	}

	public void insertBeforeNode(int node, int data) {

		Node p = start;

		if (node == start.info) {
			Node temp = new Node(data);
			temp.link = p;
			start = temp;
			return;
		}

		while ((p.link != null)) {

			if (p.link.info == node)
				break;
			p = p.link;
		}

		if (p.link == null)
			System.out.println(node + " Not Present in the list");
		else {
			Node temp = new Node(data);
			temp.link = p.link;
			p.link = temp;
		}
	}

	public void insertAtposition(int pos, int data) {

		Node p = start;

		int cnt = 1;

		while ((p != null) && (cnt < (pos - 1))) {

			p = p.link;
			cnt++;
		}

		if (p == start) {
			Node temp = new Node(data);
			temp.link = p;
			start = temp;
			return;
		}

		if (p == null)
			System.out.println(pos + " can not find");
		else {
			Node temp = new Node(data);
			temp.link = p.link;
			p.link = temp;
		}

	}

	public void deleteFirstNode() {
		Node p = start;

		if (start == null) {
			System.out.println("List is Empty");
			return;
		} else if (p.link == null) { /* Only One element in list */ 
			start = null;
			p = null;
			return;
		}

		p = p.link;
		start = p;

	}

	public void deleteLastNode() {

		Node p = start;
		Node prev = null;

		if (p == null) {
			System.out.println("List is Empty");
			return;
		} else if (p.link == null) {
			p = null;
			start = null;
			return;
		}

		while (p.link != null) {
			prev = p;
			p = p.link;
		}

		if (prev != null) {
			prev.link = null;
			System.out.println("Last Node deleted");
		}
	}

	public void deleteAnyNode(int n) {

		Node p = start;
		Node prev = null;

		while (p != null) {

			if (p.info == n)
				break;

			prev = p;
			p = p.link;

		}

		if (p == null)
			System.out.println("Element Not Found");
		else if (prev != null)
			prev.link = p.link;
		else
			start = p.link;
	}

	public void reverseList() {

		Node p = start;
		Node prev = null, next = null;

		while (p != null) {

			next = p.link;
			p.link = prev;
			prev = p;
			p = next;

		}
		start = prev;
	}

	public void bubbleSortExchData() {

		Node p, q, end;
		int temp;

		for (end = null; end != start.link;) {

			for (p = start; p.link != end; p = p.link) {

				q = p.link;
				if (p.info > q.info) {
					temp = p.info;
					p.info = q.info;
					q.info = temp;
				}
			}

			end = p;
		}
	}

	public void bubbleSortExchLinks() {

		Node p, q, r, end;
		Node temp;

		for (end = null; end != start.link; end = p) {

			for (r = p = start; p.link != end; r = p, p = p.link) {
				// r=p;
				q = p.link;

				if (p.info > q.info) {
					p.link = q.link;
					q.link = p;

					if (p != start)
						r.link = q;
					else
						start = q;

					temp = p;
					p = q;
					q = temp;

				}

			}
		}
	}

	public SingleLinkedList merge1(SingleLinkedList list) {

		SingleLinkedList mergeList = new SingleLinkedList();

		mergeList.start = merge1(start, list.start);

		return mergeList;

	}

	private Node merge1(Node p1, Node p2) {

		Node start = null;

		if (p1.info < p2.info) {

			start = new Node(p1.info);
			p1 = p1.link;

		} else if (p2.info < p1.info) {

			start = new Node(p2.info);
			p2 = p2.link;

		}

		Node pm = start;

		while ((p1 != null) && (p2 != null)) {

			if (p1.info < p2.info) {

				pm.link = new Node(p1.info);
				// pm = pm.link;
				p1 = p1.link;
			} else {
				pm.link = new Node(p2.info);
				// pm = pm.link;
				p2 = p2.link;
			}
			pm = pm.link;
		}

		while (p1 != null) {
			pm.link = new Node(p1.info);
			p1 = p1.link;
			pm = pm.link;
		}

		while (p2 != null) {
			pm.link = new Node(p2.info);
			p2 = p2.link;
			pm = pm.link;
		}

		return start;
	}

	public SingleLinkedList merge2(SingleLinkedList list) {

		SingleLinkedList mergeList = new SingleLinkedList();

		mergeList.start = merge2(start, list.start);

		return mergeList;

	}

	private Node merge2(Node p1, Node p2) {

		Node startM = null, pm = null;

		if (p1.info <= p2.info) {
			startM = p1;
			p1 = p1.link;
		} else {
			startM = p2;
			p2 = p2.link;
		}

		pm = startM;

		while (p1 != null && p2 != null) {

			if (p1.info <= p2.info) {

				pm.link = p1;
				p1 = p1.link;
			} else {

				pm.link = p2;
				p2 = p2.link;
			}
			pm = pm.link;
		}

		if (p1 == null) {
			pm.link = p2;
		} else
			pm.link = p1;

		return startM;
	}

	public void mergeSort() {
		start = mergeSort(start);
	}

	public Node mergeSort(Node start) {

		Node start1 = null, start2 = null, startM;

		if (start == null || start.link == null)
			return start;

		start1 = start;
		start2 = divideList(start);
		System.out.println("Recursion Start1 :"+start1.info);
		start1 = mergeSort(start1);
		System.out.println("Recursion Start2 :"+start2.info);
		start2 = mergeSort(start2);
		System.out.println("merge2 Start1 :"+ start1.info+" Start2 "  +start2.info);
		startM = merge2(start1, start2);

		return startM;
	}

	private Node divideList(Node p) {

		Node q = p.link.link;

		Node start2;
		while (q != null && q.link != null) {

			p = p.link;
			q = q.link.link;
		}

		start2 = p.link;
		p.link = null;

		return start2;
	}
	
	
	
	
	public void insertCycle(int val){
		Node prev = null,p = start,px=null;
		
		while(p != null){
			
			if(p.info == val)
				px = p;
			
			prev = p;
			p = p.link;
			//prev = prev.link;
		}
		
		prev.link = px;
		
	}
	
	public boolean hasCycle(){
		
		if(findCycle() != null)
			return true;
		
		return false;
	}
	
	public Node findCycle(){
		
		Node p1,p2;
		
		p1 = start;
		p2 = start;
		
		while(p2 != null && p2.link != null){
			
			p1 = p1.link;
			p2 = p2.link.link;
			
			if(p1 == p2)
				return p1;
			
		}
		
		return null;
	}
	
	public void removeCycle(){
		
		if(!hasCycle()){
			System.out.println("No Cycle Detected");
			return;
		}
		
		Node p1,p2;
		
		p1 = start;
		p2 = start;
		
		while(p2 != null && p2.link != null){
			
			p1 = p1.link;
			p2 = p2.link.link;
			
			if(p1 == p2)
				break;
			
		}
		
		int cycleLen=0;
		
		do{
			cycleLen++;
			p2=p2.link;
			
		}while(p1!=p2);
		
		
		System.out.println("Length of Cycle = "+cycleLen);
		
		int len=0;
		
		p1=start;
		
		while(p1 != p2){
			
			len++;
			p1=p1.link;
			p2=p2.link;
		}
		
		System.out.println("Length of Non Cycle = "+len);
		
		int totLen = cycleLen+len;
		
		p1=start;
		
		for(int i=0;i<totLen-1;i++)
			p1=p1.link;
		
		p1.link = null;
	}

}
