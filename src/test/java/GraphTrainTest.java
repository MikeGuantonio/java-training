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
	
	graph.printGraph();

	assertNotNull(graph); 
    }
}
