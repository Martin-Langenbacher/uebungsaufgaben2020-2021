package de.martin.uebungen;

public class Birne extends Obst {

	public Birne(String farbe) {
		super("Birne", farbe);
	}

	@Override
	public void essen() {
		System.out.println("Schmatz");
	}
}
