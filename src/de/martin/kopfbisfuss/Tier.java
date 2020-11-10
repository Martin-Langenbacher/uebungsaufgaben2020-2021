package de.martin.kopfbisfuss;

public class Tier {
	
	/* Instanzvariablen */
	
	private String name;
	private String tier;
	private int alter;
	
	/* Konstruktoren */
	/* public Tier() {
		this("Billy", "Schäferhund", 5);
	} */
	
	public Tier(String name, String tier, int alter) {
		this.name = name;
		this.tier = tier;
		this.alter = alter;
	}
	
	
	
	/* Getter & Setter */
	public String getName() {
		return name;
	}

	public String getTier() {
		return tier;
	}

	public int getAlter() {
		return alter;
	}

	
	
	/* Instanzmethoden */
	
	//public abstract void essen();
	// wenn ich die Klasse Obst abstract mache, dann muss nicht Obst die essen()-Methode implementieren, sondern die Unterklassen !!!

	@Override
	public String toString() {
		return "Name: " + name + ", Tier: " + tier + ", Alter: " + alter;
	}
	
	
	public void essen() {
		System.out.println("Das Tier isst.");
	}
	
	public void geräuschMachen() {
		System.out.println("Das Tier macht Geräusche.");
	}
	
	public void schlafen() {
		System.out.println("Das Tier schläft.");
	}
	
	public void bewegen() {
		System.out.println("Das Tier bewegt sich.");
	}

	

}
