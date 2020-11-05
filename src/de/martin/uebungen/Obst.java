package de.martin.uebungen;

public abstract class Obst implements Essbar { // das bedeutet, dass Obst sich verpflichtet eine essen()-Methode zu implementieren.
	
	/* Instanzvariablen */
	
	private String name;
	private String farbe;
	
	/* Konstruktoren */
	
	public Obst() {
		this("Obst", "grün");
	}
	
	public Obst(String name, String farbe) {
		this.name = name;
		this.farbe = farbe;
	}
	
	
	
	/* Getter & Setter */
	
	public String getName() {
		return name;
	}

	public String getFarbe() {
		return farbe;
	}
	
	
	
	/* Instanzmethoden */
	
	//public abstract void essen();
	// wenn ich die Klasse Obst abstract mache, dann muss nicht Obst die essen()-Methode implementieren, sondern die Unterklassen !!!

	@Override
	public String toString() {
		return "Name: " + name + ", Farbe: " + farbe;
		
	}

	
	
	

}
