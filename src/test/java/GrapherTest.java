package com.guantonio.javatrain;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals; 

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class GrapherTest {

    // System under test
    private Grapher grapher;

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    @DisplayName("Should create a graph")
    public void testGrpaherCreate() throws Exception {
	Grapher graph = new Grapher();

	assertNotNull(graph); 
    }

    @Test
    @DisplayName("Should have no children on standard creation")
    public void grapherChildren() {
	Grapher graph = new Grapher();

	assertEquals(graph.hasChildren(), false);
    }

    @Test
    @DisplayName("Should return the value of the node")
    public void grapherValue() {
	Grapher graph = new Grapher();

	assertEquals(graph.getName(), "");
    }
}
