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
    public void addVertex() {
	GraphTrain graph = new GraphTrain(1);

	graph.addVertex(new Vertex("bob"), 0, 0);
	graph.print();

	assertNotNull(graph); 
    }
}
