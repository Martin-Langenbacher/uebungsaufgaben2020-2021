package de.martin.uebungen;

import java.util.ArrayList;

public class Person {
	
	private String[] nachkommen;
	
	public Person() {
		
		// 3 Varianten der Felderzeugung:
		
		// (1) 
		String[] name = new String[5];
		name[0] = "Jane";
		name[1] = "John";
		// ...
		
		
		// (2)
		this.nachkommen = new String[] {"Jane", "John", "Jake"};
		
		
		// (3)
		String[] nachkommen = {"Jane", "John", "Jake"};
		
		// Android / Spring: normalerweise keine Arrays sondern ArrayList...
		// (4)
		ArrayList<Person> personenListe = new ArrayList<>();
		personenListe.add(this);
		
	}

}
