package com.lab.graph.list;

public class LinkedDigraph {
	
	int n;
	int e;
	VertexNode start;
	
	public LinkedDigraph() {
		n=0;
		e=0;
		start = null;
	}
	
	public int getVertices(){
		return n;
	}
	
	public int getEdges(){
		return e;
	}
	
	public void insertVertex(String s){
		
		VertexNode temp = new VertexNode(s);
		
		if(start == null){
			start = temp;
			return;
		}
		
		VertexNode p = start;
		
		while(p.next !=null){
			
			if(s.equals(p.name.toString())){
				System.out.println("Vertex already exists");
				return;
			}
			
			p = p.next;
		}
		
		if(s.equals(p.toString())){
			System.out.println("Vertex already exists");
			return;
		}
			
		p.next = temp;
		
		
	}
	
	public void deleteVertex(String s){
		deleteFromEdgeList(s);
		deleteFromVertexList(s);
	}
	
	private void deleteFromEdgeList(String s){
		
		VertexNode p = start;
		EdgeNode p1,prev ;
		
		if(start == null){
			System.out.println("Graph is Empty");
			return;
		}
		
		while(p!= null){ // Scan through each Vertex
			
			p1 = p.firstRef; // Get refrence to Edge list
			prev = null;
			while(p.firstRef != null && p1.nextEdge != null){  // scan through edge list and revove reference
				
					if(p1.endVertex.name.equals(s))
						break;
					prev=p1;
					p1 = p1.nextEdge;
			}
			
			if(p.firstRef != null){
				
			
				if(prev == null)
					p.firstRef = p1.nextEdge;
				else if(p1.endVertex.name.equals(s)){
					prev.nextEdge = null;
				}else{
					prev.nextEdge = p1.nextEdge;
				}
			
			}
			p = p.next;
		}
	}
	
	
	private  void deleteFromVertexList(String s){
		
		VertexNode p = start;
		VertexNode prev = start;
		
		if(start == null){
			System.out.println("Graph is Empty");
			return;
		}
		
		while(p.next != null){
			
			if(s.equals(p))
				break;
			prev=p;
			p = p.next;
			
		}
		
		if(p==start)
			start = start.next;
		else if(s.equals(p)){   // last node
			prev.next = null;
		}else{
			prev.next= p.next;
		}
			
	}
	
	public VertexNode findVertex(String s){
		
		VertexNode p = start;
		if(start == null){
			System.out.println("Graph is Empty");
			return null;
		}else{
			
			while(p.next != null){
				if(s.equals(p.name))
					return p;
				p = p.next;
			}
			
			if(s.equals(p.name))
				return p;
		}
		
		return null;
			
	}
	
	public void insertEdge(String u,String v){
		
		VertexNode p = findVertex(u);
		
		if(p != null){
			
			
			EdgeNode temp = new EdgeNode(new VertexNode(v));
			EdgeNode e = p.firstRef;
			
			while( p.firstRef != null && e.nextEdge != null)
				e = e.nextEdge;
			
			if(e == null){
				e = temp;
				p.firstRef = e;
			}
			else	
				e.nextEdge = temp;
		}
	}
	
	public void display(){
		
		VertexNode p = start;
		EdgeNode e =null;
		
		while(p != null){
			e = p.firstRef;
			System.out.print(p +" -> ");
			
			while(e != null){
				System.out.print(e.endVertex.name+" ");
				e = e.nextEdge;
			}
			System.out.println("");
			p = p.next;
			
		}
	}
	
	public boolean edgeExists(String u,String v){
		
		VertexNode p = findVertex(u);
		VertexNode p1 = start;
		EdgeNode e ;
		
		if(p != null){
			
		 if(start == null){
				System.out.println("Graph is Empty");
				return false;
			}
				
			while(p1 != null ){
				if(p1.name.equals(u))
					break;
				p1= p1.next;
			}
			
			if(p1 != null){
				e = p.firstRef;
				if(e != null){
					if(e.endVertex.name.equals(v))
						return true;
						
				}
			}
		}	
		
		return false;
	}
	
	public int outDegree(String s){
		int out =0;
		
		VertexNode p = findVertex(s);
		EdgeNode e = p.firstRef;
		
		while(e != null){
			out++;
			e = e.nextEdge;
		}
		return out;
	}
	
	
	public int inDegree(String s){
		
		int in =0;
		VertexNode p = start;
		EdgeNode e;
		
		while(p != null){
			
			e = p.firstRef;
			
			while(e != null){
				if(s.equals(e.endVertex.name))
					in++;
				e = e.nextEdge;
			}
			
			p = p.next;
			
		}
		
		
		return in;
	}

}
