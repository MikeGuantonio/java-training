package com.guantonio.javatrain;

import java.util.List;
import java.util.ArrayList;

public class Grapher {
    private String name;
    private List<Grapher> children;
    
    public Grapher() {
	this.name = "";
	this.children = new ArrayList<Grapher>(); 
    }

    public boolean hasChildren() {
	return this.children.size() != 0;
    }

    public String getName() {
	return this.name;
    }
}
