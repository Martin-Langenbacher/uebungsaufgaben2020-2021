package de.martin.uebungen;

import java.util.Arrays;

/**
 * Instanz  <==> Objekt
 * Variable <==> Attribute
 * Aufgabe des Konstruktors
 * 	- Für sauberen Startzustand des Objekts sorgen
 * 	- Wird einmalig bei Objekterzeugung aufgerufen
 * 	- Schreibt in jede Instanzvariable einen Startwert rein
 * 
 * @author martin
 *
 */



/* Themen in dieser Übung ============================================================ */

//--> Klassen

//--> Klassenvariablen

//--> Instanzvariablen

//--> Klassen-Methoden

//--> Instanz-Methoden

//--> Konstruktoren

//--> toString

//--> Kapselung (private, get, set)

/* ==================================================================================== */






public class OOBootcamp {
	
	/* Klassenvariablen - auf diese können alle Objekte zugreifen - nicht wie bei Instanzvariablen */
	static int anzahl = 0;
	
	/* Instanzvariable */
	private String[] members;
	private String trainer;
	private int week;
	private boolean remote;
	
	/* Konstruktoren =====> auf welche Weise darf man bei mir ein Objekt erzeugen... !!!  */
	// Konstruktor 1:
	/*
	public OOBootcamp() {
		this.members = new String[0];
		this.trainer = "Andre";
		week = 1;
		remote = false;
	} */
	
	// Verbesserte Version: Ich nutze die anderen Konstruktoren mit:
	// NEU - NEU - NEU 
	public OOBootcamp() {
		this(new String[0], "Andre");
	}
	
	
	// neuer 2. Konstruktor: Don't repeat yourself!
	public OOBootcamp(String[] members, String trainer) {
		this(members, trainer, 1, false);
	}
	
	
	// ==> DURCH    this(); wird es weitergeleitet !!!
	
	
	
	
	
	/*
	// Konstruktor 2:
	public OOBootcamp(String[] members, String trainer) { // -----> 1) Wie Methode, aber es gibt keinen Rückgabewert! Methode: public void Name() {} &&&_und_&&& 2) Name wie Klasse 
		
		// Hier werden die Startwerte angelegt (nicht oben; oben werden die Variablen nur deklariert !
		// members = new String[] {"Alexander", "Frank", "Monika", "Bert"};  // ---------------> new String[] muss dabei sein, sonst geht es nicht!
		
		this.members = members;
		this.trainer = trainer;
		
		// ich habe eine Instanzvariable und eine = lokale Varibable ==> lokal vor global
		// this. ==> vom Objekt
		
		
		week = 1;
		remote = false;
	} */
	
	
	
	// Konstruktor 3:
	public OOBootcamp(String[] members, String trainer, int week, boolean remote ) {  
		this.members = members.clone();
		this.trainer = trainer;
		this.week = week;
		this.remote = remote;
		anzahl++; // Objekte zählen...
//		OOBootcamp.anzahl++; // alternative Schreibweise !
	}


	

	
	/* Instanzmethoden */
	public String[] getMembers() {
		return members;
	}


	public void setMembers(String[] members) {
		this.members = members.clone();
	}
	
	// =========================================================================================
	public void plusOneMember(String member) {
		// neues Feld mit Länge um eins länger
		String[] members = new String[this.members.length +1];
		
		// bisherige Werte rüberschieben
		for (int i = 0; i < members.length; i++) {
			members[i] = this.members[i];
		}
		
		// in das hinterste freie Feld den neuen Wert reinschreiben
		members[members.length -1] = member;
		
		// Referenz umlegen
		this.members = members;
	}
	// =========================================================================================


	public String getTrainer() {
		return trainer;
	}


	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}


	public int getWeek() {
		return week;
	}


	// abgewandelt: Es wird immer hochgezählt: Man kann den Wert nicht selbst setzen !!!
	public void incrementWeek() {
		this.week++;
	}


	public boolean isRemote() {
		return remote;
	}


	public void setRemote(boolean remote) {
		this.remote = remote;
	}


	
	
	/* Methode toString */
	@Override
	public String toString() {
		System.out.println();
		System.out.println("==>> Inside the 'toString-Method': ");
		return Arrays.toString(this.members) + " | " + this.trainer;
		
		//return "OOBootcamp [members=" + Arrays.toString(members) + ", trainer=" + trainer + ", week=" + week + ", remote=" + remote + "]";
	}
	
	
	
	

	/* Klassenmethoden */
	
	// Alles was static ist ist eine Klassenmethoden ohne static hätte das Object eine xy-Methode...
	
	public static void foo() {  			// Fall 1: static 		--> gehört zur Klasse: 	OOBootcamp.foo(); 
		System.out.println("bar");			// Fall 2: ohne static 	--> gehört zum Objekt: 	b.foo();
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Anzahl der erstellten Objekte: " + anzahl);
		OOBootcamp b = new OOBootcamp();
		OOBootcamp.foo(); // foo() --> sieht man an dem 'S', dass es eine Klassen-Methode ist.
		b.foo();  // vom Objekt kann man auch eine Klassen-Methode aufrufen, sollte man aber nicht tun; darum kommt eine Warnung !
		
		
		
		System.out.println("Anzahl der erstellten Objekte: " + anzahl);
		OOBootcamp b1 = new OOBootcamp();
		System.out.println("Anzahl der erstellten Objekte: " + anzahl);
		OOBootcamp b2 = new OOBootcamp();
		System.out.println("Anzahl der erstellten Objekte: " + anzahl);
		
		
	}
	
	
	

}
