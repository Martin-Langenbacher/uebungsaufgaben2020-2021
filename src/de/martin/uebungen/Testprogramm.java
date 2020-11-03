package de.martin.uebungen;

public class Testprogramm {
	
	/* Sichtbarkeiten:
	 * ===================
	 * 
	 * public. öffentlich
	 * protected: nur innerhalb des Packages und für Untertypen
	 * default/package: nur innerhalb des Packages sichtbar
	 * private: nur innerhalb der Klasse
	 * 
	 */
	
	/* Klassenvariablen */
	// static: Dann gehört es zur Klasse !!!
	public static int zahl;  // private would not work: no access to Class A !!!

	public static void main(String[] args) {
		
		String s1 = "Hallo";
		String s2 = "Hallo";
		
		//if (s1 == s2) {
		//if (s1.contentEquals(s2)) {
		if (s1.equals(s2)) {
			System.out.println("stimmt");
		} else {
			System.out.println("stimmt nicht");
		}
		
		
		/* Caesar Chiffre */
		char c = 'D';
		int key = 5;
		
		System.out.println( (char) (c + key));  // I kommt heraus: 5 Buchstaben weiter...
		
		int i = 5;
		//i = i++; // gefährlich !!! --> Hier kommt 5 heraus!
		//i++; // hier kommt 6 heraus: OK!
		 i = ++i;  // hier kommt auch 6 heraus: Ok!
		System.out.println(i);
		
		
		
		/* String-Operationen */
		String a1 = "Hallo ";
		String a2 = "Welt ";
		String a3 = a1.concat(a2);
		System.out.println(a3);
		System.out.println(a1.lastIndexOf('l') + " --> Das war die Zahl, an der das letzte mal [l] in " + a1 + " kommt.");
		zahl = 25;
		System.out.println("Mit Klasse A: " + A.add(2, 3));

	}

}
