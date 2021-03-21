package com.guantonio.javatrain;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName; 

// All Tests for this class will be with an adj matrix
// Will come back for adj list
public class GraphTrainTest {

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }
    
    @Test
    @DisplayName("Should Create A Graph")
    public void createGraph() {
	GraphTrain graph = new GraphTrain(5);
	
	graph.print();

	assertNotNull(graph); 
    }

    @Test
    @DisplayName("Should add a vertex to the matrix")
    public void addEdge() {
	GraphTrain graph = new GraphTrain(1);

	graph.addEdge(new Vertex("bob"), 0, 0);
	graph.print();

	assertNotNull(graph); 
    }

    @Test
    @DisplayName("Should not be able to place a vertex in a non-present area of the graph")
    public void addNonPresentEdge() {
	GraphTrain graph = new GraphTrain(2);

	graph.addEdge(new Vertex("Sally"), 5, 5);
	graph.print();

	assertNotNull(graph); 
    }

    @Test
    @DisplayName("Should remove a vertex from the matrix")
    public void removeEdge() {
	GraphTrain graph = new GraphTrain(3);

	graph.addEdge(new Vertex("Nick"), 0, 2);
	graph.print();
	
	graph.removeEdge(0, 2);
	graph.print(); 

	assertNotNull(graph); 
    }

    @Test
    @DisplayName("Should not be able to remove a vertex from nowhere")
    public void removeNotPresent() {
	GraphTrain graph = new GraphTrain(2);

	graph.addEdge(new Vertex("Devon"), 1, 1);
	graph.print();

	graph.removeEdge(6, 6);
	graph.print();

	assertNotNull(graph); 
    }
}
