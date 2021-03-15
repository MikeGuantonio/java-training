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

    // Utility method to visualize graph
    public void printGraph() {
	for(int i = 0; i < this.edges.length; i++){
	    for(int j = 0; j < this.edges[i].length; j++){
		System.out.print(this.edges[i][j] + " "); 
	    }
	    System.out.println(""); 
	}
    }

    // contains a list of children
    public void initGraph() {
	for(int i = 0; i < this.edges.length; i++){
	    for(int j = 0; j < this.edges[i].length; j++){
		this.edges[i][j] = new Vertex(); 
	    }
	}
    }
}
