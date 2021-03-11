package com.guantonio.javatrain;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull; 
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse; 

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

    @Test
    @DisplayName("Should not add nodes that do not exist")
    public void grapherChildNone(){
	Grapher graph = new Grapher("Nick");

	graph.add(null);

	assertFalse(graph.hasChildren());
    }

    @Test
    @DisplayName("Should remove a link to a known node")
    public void grapherChildNodeRemove() {
	Grapher graph = new Grapher("Nick");
	graph.add(new Grapher("Sally"));

	assertTrue(graph.hasChildren()); 
	
	graph.remove("Sally");

	assertFalse(graph.hasChildren());
    }

    @Test
    @DisplayName("Should reove nothing if child cannot be found")
    public void grapherRemoveNonNode(){
	Grapher graph = new Grapher("Nick");

	graph.remove("Sam");

	assertFalse(graph.hasChildren());
    }

    @Test
    @DisplayName("Should not remove a child if no name is given")
    public void grapherRemoveNonName(){
	Grapher graph = new Grapher("Nick");

	graph.remove("");

	assertFalse(graph.hasChildren());
    } 
}
