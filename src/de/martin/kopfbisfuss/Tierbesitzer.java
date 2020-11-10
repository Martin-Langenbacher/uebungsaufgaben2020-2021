package de.martin.kopfbisfuss;

public class Tierbesitzer {
	
	public void start() {
		
		Tierarzt t = new Tierarzt();
		Hund h = new Hund();
		Ente e = new Ente("TierarztEnte", "Ente", 8);
		
		t.spritzeGeben(h);
		t.spritzeGeben(e);
		System.out.println("Tierarzt: " +t);
		
		
	}

}
