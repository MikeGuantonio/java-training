package com.guantonio.javatrain;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull; 
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue; 

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

    @Test
    @DisplayName("Should create a node on the graph with a name")
    public void grapherCreateWithName(){
	Grapher graph = new Grapher("Nick");

	assertEquals(graph.getName(), "Nick");
    }

    // Keep in mind that this test tightly couples to the implementation and not
    // the behavior. We need to review this
    @Test
    @DisplayName("Should not create a node with a null name")
    public void grapherNullName(){
	Throwable ex = assertThrows(NullPointerException.class, () -> new Grapher(null));
	assertEquals("name should not be empty", ex.getMessage()); 
    }

    @Test
    @DisplayName("Should attach a node to my graph")
    public void grapherChildAdd(){
	Grapher graph = new Grapher("Nick");

	graph.add(new Grapher("Bob"));

	assertTrue(graph.hasChildren()); 
    }
}
