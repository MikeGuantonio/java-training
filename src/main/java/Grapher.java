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

	int size = this.children.size(); 
	for(int i = 0; i < size; i++){
	    if (name == this.children.get(i).getName()){
		found = this.children.get(i);
		break;
	    }
	}

	if(found != null){
	    this.children.remove(found); 
	}
    }
		
}
