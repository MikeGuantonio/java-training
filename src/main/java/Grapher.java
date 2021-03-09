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
}
