package de.martin.kopfbisfuss;

public class Hund extends Tier {
	
	
	/* Konstruktoren */
	public Hund() {
		this("Billy", "Schäferhund", 5);
	}
	
	public Hund(String name, String rasse, int alter) {
		super(name, rasse, alter);
	}
	
	
	
	

	public void geräuschMachen() {
		System.out.println("Der Hund bellt: Wau, Wau!");
	}
	
	
	
	
	
	
	
	
	/*

private int j;
	
	
	/* Instanzvariablen 
	private boolean wurm;
	
	
	/* Konstruktoren 
	
	public Apfel(String farbe) {
		super("Apfel", farbe);
	}

	
	/* Getter & Setter 
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
	
	
	public void alexanderMartinMethode() {
		int i;
		i = 4;
		System.out.println();
		System.out.println("Dem Wert 'j' wurde noch nichts zugewiesen aber es ergibt den Wert: " +j);
		System.out.println("Nur wenn ein Wert zugewiesen wurde, dann kann man die Klasse compilieren und es ergibt er Wert: " +i);
	}


*/
	
}
