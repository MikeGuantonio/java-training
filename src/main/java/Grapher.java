package com.guantonio.javatrain;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects; 

public class Grapher {
    private String name;
    private List<Grapher> children;
    
    public Grapher() {
	this.name = "";
	this.children = new ArrayList<Grapher>(); 
    }

    public Grapher(String name) {
	this.name = Objects.requireNonNull(name, "name should not be empty");
	this.children = new ArrayList<Grapher>(); 
    }

    public boolean hasChildren() {
	return this.children.size() != 0;
    }

    public String getName() {
	return this.name;
    }

    public void add(Grapher node) {
	if (null != node){
	    this.children.add(node);
	} 
    }

    public void remove(String name) {
	Grapher found = null;

	// May have a performance hit.
	// Each time I am looping I'm creating a new node
	for(Grapher node : this.children) {
	    if (name == node.getName()){
		found = node;
	    }
	}

	if(found != null){
	    this.children.remove(found); 
	}
    }
		
}
