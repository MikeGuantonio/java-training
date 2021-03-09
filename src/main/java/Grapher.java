package com.guantonio.javatrain;

import java.util.List;
import java.util.ArrayList;

public class Grapher {
    private int value;
    private List<Grapher> children;
    
    public Grapher() {
	this.children = new ArrayList<Grapher>(); 
    }
}
