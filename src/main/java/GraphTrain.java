package com.guantonio.javatrain;

public class GraphTrain {
    // contains a list of children
    private Vertex[][] edges;

    public GraphTrain() {
    }
    
    public GraphTrain(int totalVertex) {
	// We create a number of nodes
	// We create a square matrix based on the number of nodes
	this.edges = new Vertex[totalVertex][totalVertex];
	this.initGraph(); 
    }

    public void addEdge(Vertex node, int x, int y) {
	// Check for anything out of bound for x axis
	if(x <  0 || x > this.edges.length){
	    return;
	}

	// Check to see we are in range for the y axis.
	// Since we are a squre for right now, a check on the first row
	// should be fine
	if(y < 0 || y > this.edges[x].length){
	    return; 
	}
	
	this.edges[x][y] = node; 
    }

    public void removeEdge(int x, int y) {
	if(!this.inBounds(x, y)){
	    return;
	}
	
	this.edges[x][y] = Vertex.EmptyNode(); 
    }

    // Utility method to visualize graph
    public void print() {
	for(int i = 0; i < this.edges.length; i++){
	    for(int j = 0; j < this.edges[i].length; j++){
		System.out.print(this.edges[i][j] + " "); 
	    }
	    System.out.println(""); 
	}
	System.out.println(""); 
    }

    // contains a list of children
    public void initGraph() {
	for(int i = 0; i < this.edges.length; i++){
	    for(int j = 0; j < this.edges[i].length; j++){
		this.edges[i][j] = Vertex.EmptyNode(); 
	    }
	}
    }

    private boolean inBounds(int x, int y) {
	if(x <  0 || x > this.edges.length){
	    return false;
	}

	// Check to see we are in range for the y axis.
	// Since we are a squre for right now, a check on the first row
	// should be fine
	if(y < 0 || y > this.edges[x].length){
	    return false; 
	}

	return true; 
    }
}

