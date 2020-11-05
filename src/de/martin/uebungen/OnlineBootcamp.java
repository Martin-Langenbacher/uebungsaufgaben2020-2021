package de.martin.uebungen;

import java.util.Arrays;

public class OnlineBootcamp extends OOBootcamp {
	
	/* Instanzvariablen */
	
	private String tool;
	
	
	
	
	/* Konstruktoren */
	
	public OnlineBootcamp(String[] members, String trainer, String tool) {
		super(members, trainer, 1, true);
		this.tool = tool;
		
		// Ganz wichtig:
		// Versucht nicht in der Unter-Klasse die Startwerte selber zu setzen!
		// dafür ist immer der Konstruktor der Oberklasse verantwortlich! super(.......);
	}
	

	
	
	/* toString */
	@Override
	public String toString() {
		System.out.println();
		System.out.println("==>> Inside the 'toString-Method' von OnlineBootcamp: ");
		return "ONLINE " + super.toString() + "\nTool:\t\t" + this.tool;
	
		
		//return "OOBootcamp [members=" + Arrays.toString(members) + ", trainer=" + trainer + ", week=" + week + ", remote=" + remote + "]";
	}
}
