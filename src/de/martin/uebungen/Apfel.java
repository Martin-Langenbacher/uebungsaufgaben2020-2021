package de.martin.uebungen;

public class Apfel extends Obst {
	
	
	/* Instanzvariablen */
	private boolean wurm;
	
	
	/* Konstruktoren */
	
	public Apfel(String farbe) {
		super("Apfel", farbe);
	}

	
	/* Getter & Setter */
	public boolean hatWurm() {
		return wurm;
	}


	public void setWurm(boolean wurm) {
		this.wurm = wurm;
	}


	@Override
	public void essen() {
		if (this.hatWurm()) {
			System.out.println("Bähh");
		} else {
			System.out.println("Lecker");
		}
		
		
	}
	
}
