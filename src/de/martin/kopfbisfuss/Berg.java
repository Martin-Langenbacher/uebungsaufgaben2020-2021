package de.martin.kopfbisfuss;

public class Berg {
	String name;
	int höhe;
	
	Berg(String n, int h) {
		name = n;
		höhe = h; 
	}
	
	public String toString() {
		return name + " " + höhe;
	}

}
