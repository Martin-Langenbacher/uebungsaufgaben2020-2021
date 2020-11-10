package de.martin.kopfbisfuss;

public class Ente extends Tier {

	public Ente(String name, String tier, int alter) {
		super(name, tier, alter);
	}
	


	public void geräuschMachen() {
		super.geräuschMachen();
		System.out.println("Quaaaaaaaaaaaaaak!");
	}
	
	
	
	

}
