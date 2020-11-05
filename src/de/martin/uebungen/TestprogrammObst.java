package de.martin.uebungen;

public class TestprogrammObst {

	public static void main(String[] args) {
		
		//Obst obst1 = new Obst();  // --> Because Obst is abstract, I cannot make an Obst object: Nur in den Unterklassen !!!
		Obst apfel1 = new Apfel("Grün");
		Obst apfel2 = new Apfel("Gelb");
		Apfel apfel3 = new Apfel("Rot");
		Obst birne	= new Birne("Braun");
		
		// Nur wenn ich ein cast mache, dann kann ich die Mesthode (hatWurm();) in Apfel aufrufen; in Obst gibt es keine Methode hat Wurm.
		((Apfel) apfel1).hatWurm();
		apfel3.setWurm(true);
		
		//System.out.println(obst1);
		System.out.println(apfel1);
		System.out.println(apfel2);
		System.out.println(apfel3);
		System.out.println(birne);
		
		apfel1.essen();
		apfel3.essen();
		birne.essen();
		
		Essbar irgendwas = new Birne("Pink");
		System.out.println(irgendwas);
		irgendwas.essen();
		
	}

}
