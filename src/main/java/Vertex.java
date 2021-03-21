package com.guantonio.javatrain;

public class Vertex {
    private String name;

    public Vertex() {
	this.name = "None";
    }

    public static Vertex EmptyNode() {
	return new Vertex();
    }

    public Vertex(String name) {
	this.name = name;
    }

    public String toString() {
	return this.name;
    }

    @Override
    public boolean equals(Object obj) {
	if(obj == this){
	    return true;
	}

	if(!(obj instanceof Vertex)){
	    return false;
	}

	Vertex other = (Vertex)obj;

	return this.name == other.name; 
    }
}
